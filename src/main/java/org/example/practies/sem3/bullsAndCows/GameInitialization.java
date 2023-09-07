package org.example.practies.sem3.bullsAndCows;

import lombok.extern.slf4j.Slf4j;
import org.example.practies.sem3.bullsAndCows.typeOfGames.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

@Slf4j
public class GameInitialization {

    static final String PRINTLEN = "what word length you want? input only > 0";
    private final String PRINTATT = "how much attempts you want? input only > 0";
    public void getStart(){
        boolean continueParam = true;

        while(continueParam){

            int wordLen;
            int howMuchTry;
            String inputWordLen;
            String inputAttempts;

            String regex = "^[1-9]+$";
            Scanner scanner = new Scanner(System.in);

            System.out.println("choose game:\n1-rus\n2-eng\n3-num");

            switch (scanner.nextLine()) {
                case "rus", "1" -> {
                    do {
                        System.out.println(PRINTLEN);
                        inputWordLen = scanner.nextLine();
                        wordLen = Integer.parseInt(inputWordLen);

                        System.out.println(PRINTATT);
                        inputAttempts = scanner.nextLine();
                        howMuchTry = Integer.parseInt(inputAttempts);

                    } while (!inputWordLen.matches(regex) || !inputAttempts.matches(regex));

                    tryWinnerGame(new GameByRus(), wordLen, howMuchTry);
                }
                case "eng", "2" -> {
                    do {
                        System.out.println(PRINTLEN);
                        inputWordLen = scanner.nextLine();
                        wordLen = Integer.parseInt(inputWordLen);

                        System.out.println(PRINTATT);
                        inputAttempts = scanner.nextLine();
                        howMuchTry = Integer.parseInt(inputAttempts);
                    } while (!inputWordLen.matches(regex) || !inputAttempts.matches(regex));

                    tryWinnerGame(new GameByEng(), wordLen, howMuchTry);
                }
                case "num", "3" -> {
                    do {
                        System.out.println(PRINTLEN);
                        inputWordLen = scanner.nextLine();
                        wordLen = Integer.parseInt(inputWordLen);

                        System.out.println(PRINTATT);
                        inputAttempts = scanner.nextLine();
                        howMuchTry = Integer.parseInt(inputAttempts);
                    } while (wordLen <= 0 || howMuchTry <= 0);

                    tryWinnerGame(new GameByNumbers(), wordLen, howMuchTry);
                }
                default -> System.out.println("try again");
            }

            System.out.println("would continue? y/n");
            if(!"y".equals(scanner.nextLine())){
                continueParam = false;
            }
        }
    }

    private void tryWinnerGame(Game game, int wordSize, int tryingCount){
        log.info("======== " +
                "start with " + wordSize + " - word size, " + tryingCount + " - max try"
                +" ========");
        log.info("game status: " + game.getStatus());
        game.start(wordSize,tryingCount);

        Scanner scanner = new Scanner(System.in);

        while(game.getStatus() != (GameStatus.LOSE)
                && game.getStatus() !=(GameStatus.WIN)){
            String userInputValue = scanner.nextLine();
                game.inputValue(userInputValue);
        }

        System.out.println(game.getStatus());
        System.out.println("would check your game story? y/n");
        if("y".equals(scanner.nextLine())){
            getInfoFromLogger();
        }
    }

    private void getInfoFromLogger(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "src/main/java/org/example/practies/sem3/bullsAndCows/logs/application.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
