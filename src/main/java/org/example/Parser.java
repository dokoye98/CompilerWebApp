package org.example;

import org.example.compilerFunctions.Token;
import org.example.compilerFunctions.TokenCheck;
import org.w3c.dom.Node;

import java.util.List;

public class Parser {
    public List<Token> tokens;
    public int currentPlace = 0;

public Parser(List<Token> tokens){
    this.tokens = tokens;
}

public Node midStep(TokenCheck expectedType) throws Exception {
    if (currentPlace < tokens.size()) {
        Token token = tokens.get(currentPlace);


    }
    return null;
}
}
