package org.example;

import org.example.compilerFunctions.Token;
import org.example.compilerFunctions.TokenCheck;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

    private  String input;
    private  List<Token> tokens ;

    public Lexer(String input) {
        this.input = input;
        this.tokens = new ArrayList<>();
    }

public void splitter(){
    String[] words = input.split("\\s+",2);

        boolean flag = false;
        for (TokenCheck type : TokenCheck.values()) {
            if (words[0].equals(type.getKeyword())) {
                tokens.add(new Token(type, words[0]));
                flag = true;
                break;
                }
            }
        if(flag && words.length > 1){
            tokens.add(new Token(TokenCheck.LITERAL,words[1]));
        } else if (!flag) {
            tokens.add(new Token(TokenCheck.UNKNOWN,"Unkown command: "+ words[0]));

        }

}
public  List<Token> getTokens(){

        return tokens;
}


}
