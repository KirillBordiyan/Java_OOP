package org.example.practies.sem3.bullsAndCows.abstractGamesClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    private String userInput;
    private int bull;
    private int cow;

    @Override
    public String toString() {
        return "Answer: \n" +
                "input: " + userInput+
                "\nbull: " + bull +
                "\ncow: " + cow;
    }
}
