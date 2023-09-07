package org.example.practies.sem3.bullsAndCows;

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
        return "Answer-> " +
                "input: " + userInput+
                " bull: " + bull +
                " cow: " + cow;
    }
}
