package org.example;

import org.example.compilerFunctions.Token;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.Stream;

public class Compiler {
    public static void main(String[] args) throws IOException {
        Scanner scanner;
        if (args.length > 0) {
            // Command-line argument provided, assume it's a file path
            try {
                File file = new File(args[0]);
                scanner = new Scanner(file);
            } catch (Exception e) {
                System.err.println("Error opening file: " + args[0]);
                return;
            }
        } else {
            // No command-line argument, read from standard input
            scanner = new Scanner(System.in);
            System.out.println("Enter input:");
        }

        while (scanner.hasNextLine()) {
            String inputLine = scanner.nextLine();
            Lexer l = new Lexer(inputLine);
            l.splitter();
            Stream<Token> t1 = l.getTokens().stream();
            t1.forEach(System.out::println);
        }

        scanner.close();

    }
}