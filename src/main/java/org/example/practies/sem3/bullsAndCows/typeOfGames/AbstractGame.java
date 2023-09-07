package org.example.practies.sem3.bullsAndCows.typeOfGames;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.practies.sem3.bullsAndCows.Answer;

import java.util.ArrayList;

@Slf4j
public abstract class AbstractGame<T> implements Game {
    Integer wordSize, tryingCount;
    String word;
    GameStatus gameStatus = GameStatus.INIT;

    /**
     * @apiNote предзаполняет слово компьютера
     * @return слово для угадывания
     */
    public String generateWord(int wordSize){
        String alphabet = generateCharList().toString().replaceAll("[,\\s\\[\\]]", "");
        return RandomStringUtils.random(wordSize, alphabet);
    }

    abstract ArrayList<T> generateCharList();

    @Override
    public void start(Integer wordSize, Integer tryingCount) {
        this.wordSize = wordSize;
        this.tryingCount = tryingCount;
        this.word = generateWord(wordSize);
        this.gameStatus = GameStatus.START;

        System.out.println("подсказка: " + word);
        log.info("mystery word is '" + word + "'"+
                " -------- game status is: " + gameStatus);
    }

    @Override
    public Answer inputValue(String value) {

        gameStatus = GameStatus.PROGRESS;
        tryingCount--;
        log.info("user try: " + value + ", there are " + tryingCount  +" attempts left"
        + ", game status is: " + gameStatus);
        int bull = 0;
        int cow = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.indexOf(value.charAt(i)) != -1){
                if(word.charAt(i) == value.charAt(i)){
                    bull++;
                }
                cow++;
            }
        }

        Answer answer = new Answer(value, bull,cow);
        log.info("current result: " + answer);

        if(word.length() == bull){
            gameStatus = GameStatus.WIN;
            log.info("game status is -> " + gameStatus);
        }else if(tryingCount == 0 && !gameStatus.equals(GameStatus.WIN)){
            gameStatus = GameStatus.LOSE;
            log.info("game status is -> " + gameStatus);
        }
        return answer;
    }

    @Override
    public GameStatus getStatus() {
        return gameStatus;
    }
}
