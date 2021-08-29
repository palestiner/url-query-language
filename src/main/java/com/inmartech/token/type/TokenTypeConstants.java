package com.inmartech.token.type;

public enum TokenTypeConstants {
    // todo rename any names
    NUMBER(new TokenType("NUMBER", "[0-9]*")),
    VAR(new TokenType("VAR", "[a-z]*")),
    SPACE(new TokenType("SPACE", "[\\s+\\n\\t\\r]")),
    EQUALS(new TokenType("EQUALS", "EQ")),
    NOT_EQUALS(new TokenType("NOT_EQUALS", "NE")),
    GTE(new TokenType("GTE", "GTE")),    // greater than or equal
    LTE(new TokenType("LTE", "LTE")),    // less than or equal
    GT(new TokenType("GT", "GT")),      // greater than
    LT(new TokenType("LT", "LT")),      // less than
    IN(new TokenType("IN", "IN")),
    OR(new TokenType("OR", "OR")),
    AND(new TokenType("AND", "AND")),
    COMMA(new TokenType("COMMA", ",")),
    L_SQUARE_BRACKET(new TokenType("L_SQUARE_BRACKET", "\\[")),
    R_SQUARE_BRACKET(new TokenType("R_SQUARE_BRACKET", "]")),
    L_PAR(new TokenType("L_PAR", "\\(")),
    R_PAR(new TokenType("R_PAR", "\\)")),
    LIST(new TokenType("R_PAR", "\\)"));

    private final TokenType type;

    TokenTypeConstants(TokenType tokenType) {
        type = tokenType;
    }

    public TokenType getType() {
        return type;
    }

    public String getName() {
        return this.type.getName();
    }

    public String getRegex() {
        return this.type.getRegex();
    }
}
