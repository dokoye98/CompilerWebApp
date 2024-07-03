package org.example;

import org.example.compilerFunctions.Token;

import java.util.Scanner;
import java.util.stream.Stream;

public class Compiler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ready to receive input:");
        System.out.flush();
        while (scanner.hasNextLine()) {
            String inputLine = scanner.nextLine();
            if (inputLine.equalsIgnoreCase("exit")) {
                break; // Stop processing if "exit" is received
            }
            Lexer lexer = new Lexer(inputLine);
            lexer.splitter();
            Stream<Token> tokens = lexer.getTokens().stream();
            tokens.forEach(t-> {
                System.out.println(t);
                System.out.flush();
            });
        }

        System.out.println("Finished processing input.");
        System.out.flush();
        scanner.close();



      }


}