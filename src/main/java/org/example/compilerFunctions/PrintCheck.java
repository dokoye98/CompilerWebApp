package org.example.compilerFunctions;

public class PrintCheck {
    public static String CheckAndEdit(String value){
        String trimmed = "";
        if(!value.startsWith("'") && !value.endsWith("'")){
            return "Error";
        }
        trimmed = value.substring(1,value.length()-1);
        return trimmed;
    }
}
