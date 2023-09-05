package org.example.practies.sem3.bullsAndCows;

import org.example.practies.sem3.bullsAndCows.abstractGamesClasses.GameByEng;
import org.example.practies.sem3.bullsAndCows.abstractGamesClasses.GameByNumbers;
import org.example.practies.sem3.bullsAndCows.abstractGamesClasses.GameByRus;

import java.util.Scanner;

public class Sem3GameMain {
    public static void main(String[] args) {

        Game game1 = new GameByNumbers();
        tryWinnerGame(game1, 3,3);

        Game game2 = new GameByRus();
        tryWinnerGame(game2, 2,2);

        Game game3 = new GameByEng();
        tryWinnerGame(game3, 4, 1);
    }


    static void tryWinnerGame(Game game, int wordSize, int tryingCount){
        game.start(wordSize,tryingCount);
        Scanner scanner = new Scanner(System.in);
        while(game.getStatus() != (GameStatus.LOSE)
                && game.getStatus() !=(GameStatus.WIN)){
            System.out.println(game.inputValue(scanner.nextLine()));
        }
        System.out.println(game.getStatus());

    }
}
