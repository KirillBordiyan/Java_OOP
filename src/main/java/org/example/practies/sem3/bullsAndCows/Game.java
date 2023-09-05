package org.example.practies.sem3.bullsAndCows;

import org.example.practies.sem3.bullsAndCows.abstractGamesClasses.Answer;

public interface Game {
    //a)Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue,getGameStatus)

    void start(Integer wordSize, Integer tryingCount);
    Answer inputValue(String value);
    GameStatus getStatus();

}
