package org.example.practies.sem3.bullsAndCows.typeOfGames;

import java.util.ArrayList;

public class GameByRus extends AbstractGame{

    @Override
    ArrayList<String> generateCharList() {
        ArrayList<String> resultList = new ArrayList<>();

        for(int i = 'а'; i <= 'я'; i++){
            resultList.add(String.valueOf((char)i));
        }
        resultList.add("ё");
        return resultList;
    }
}
