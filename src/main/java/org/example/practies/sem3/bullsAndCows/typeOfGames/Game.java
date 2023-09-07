package org.example.practies.sem3.bullsAndCows.typeOfGames;

import org.example.practies.sem3.bullsAndCows.Answer;

public interface Game {
    void start(Integer wordSize, Integer tryingCount);
    Answer inputValue(String value);
    GameStatus getStatus();
}
