package org.example;

import org.example.parserFunctions.Items;
import org.example.parserFunctions.Trimmer;

import java.util.List;

public class Parser {


    private enum Command{
        PRINT,
        VAR,
        UNKNOWN
    }

    private final List<String> token;
    private  List<String> token1;
    private int tokenPosition;
    public Parser(List<String> token){
        this.token = token;
    }
    public void commandFinder(){
        Command command;
        try{
            command = Command.valueOf(token.getFirst().toUpperCase());
        }catch(Exception e){
            command = Command.UNKNOWN;
            System.out.println("UNKNOWN COMMAND");
        }
//Switch due to future command
        switch(command){
            case PRINT:
                printFunction();
                break;
            case VAR:
                variableFunction();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + command);
        }
    }
    public void printFunction(){
        token.removeFirst();
        if(tokenPosition < token.size()){
            String x = Trimmer.trim(token);
            token1 = List.of(x.substring(1,x.length()-1).split(" "));
            System.out.println(token1);
        }
        else{
            System.out.println("Expected code after command");

        }
    }

    public void variableFunction(){
        token.removeFirst();
        if(tokenPosition < token.size()){
            Items.assign(token);
            String x = Trimmer.trim(token);
            token1 = List.of(x.substring(1,x.length()-1).split(" "));
            System.out.println(token1);

        }else{
            System.out.println("Empty code");
        }
    }

}
