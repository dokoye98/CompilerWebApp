package org.example.parserFunctions;

import java.util.List;

public class Trimmer {

    public static String trim(List<String> tokens){

        StringBuilder trimmedWord = new StringBuilder();
        for(String i: tokens){
            trimmedWord.append(" ").append(i);
        }
        String res = trimmedWord.toString();

        return res.substring(1,trimmedWord.length());
    }
}
