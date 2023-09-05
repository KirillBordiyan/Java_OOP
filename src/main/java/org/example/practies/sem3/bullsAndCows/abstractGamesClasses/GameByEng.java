package org.example.practies.sem3.bullsAndCows.abstractGamesClasses;

import java.util.ArrayList;

public class GameByEng extends AbstractGame{

    @Override
    ArrayList<String> generateCharList() {
        ArrayList<String> resultList = new ArrayList<>();

        for(int i = 'a'; i <= 'z'; i++){
            resultList.add(String.valueOf((char)i));
        }
        return resultList;
    }
}
