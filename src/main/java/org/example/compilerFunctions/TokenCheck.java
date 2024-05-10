package org.example.compilerFunctions;

public enum TokenCheck {

    PRINT("print"),
    UNKNOWN("unkown"),
    LITERAL("literal"),
    VAR("var");

private final String function;
    TokenCheck(String function) {
        this.function  = function;

    }

    public String getKeyword() {
        return function;
    }
}
