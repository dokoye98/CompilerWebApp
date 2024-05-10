package org.example.compilerFunctions;

import java.util.List;

public class Items {
    private static String variable;
    private static List<String> result;

    public String getVariable() {
        return variable;
    }

    public List<String> getResult() {
        return result;
    }

  public static List<String> assign(List<String> token){
variable = token.getFirst();
token.removeFirst();
token.remove("=");
result = token;
return token;

  }


}
