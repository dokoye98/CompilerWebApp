package org.example;

import java.util.Scanner;

public class SMLFileReader {


    private Scanner scan;

    public SMLFileReader(Scanner scan){
        this.scan = scan;
    }


    public String FileRead(){
        StringBuilder sb = new StringBuilder();
        while(scan.hasNext()){
            sb.append(scan.nextLine());
        }

        return sb.toString();
    }



}
