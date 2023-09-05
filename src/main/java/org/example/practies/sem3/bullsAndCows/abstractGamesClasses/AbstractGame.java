package org.example.practies.sem3.bullsAndCows.abstractGamesClasses;

import org.example.practies.sem3.bullsAndCows.Game;
import org.example.practies.sem3.bullsAndCows.GameStatus;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;

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
        //TODO убрать при сдаче вывод в консоль списка символов
        System.out.println(alphabet);
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
    }


    //TODO обратить внимание на метод при выполнении
    @Override
    public Answer inputValue(String value) {
        tryingCount--;
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

        if(word.length() == bull){
            gameStatus = GameStatus.WIN;
        }else if(tryingCount == 0 && !gameStatus.equals(GameStatus.WIN)){
            gameStatus = GameStatus.LOSE;
        }
        return new Answer(value, bull,cow);
    }

    @Override
    public GameStatus getStatus() {
        return gameStatus;
    }
}
