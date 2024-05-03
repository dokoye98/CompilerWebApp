package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

    private final String input;
    private final List<String> letters;
    private int place;
    public Lexer(String input) {
        this.input = input;
        this.letters = new ArrayList<>();
        this.place = 0;
    }
    public List<String> splitter(){
        while(place < input.length()){
            char let = input.charAt(place);
            if(Character.isSpaceChar(let)){
                place++;
            }else{
                int tokplace = place;
                while(place < input.length() && !Character.isSpaceChar(input.charAt(place))){
                    place++;
                }
                String token = input.substring(tokplace,place);
                letters.add(token);
            }
        }
        return letters;

    }
}
