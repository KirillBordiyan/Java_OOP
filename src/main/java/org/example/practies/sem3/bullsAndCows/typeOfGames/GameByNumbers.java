package org.example.practies.sem3.bullsAndCows.typeOfGames;

import java.util.ArrayList;
import java.util.Arrays;

public class GameByNumbers extends AbstractGame{

    @Override
    ArrayList<Integer> generateCharList() {
        return new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
    }
}
