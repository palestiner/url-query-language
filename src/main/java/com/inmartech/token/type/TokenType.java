package com.inmartech.token.type;

import java.util.Objects;

public class TokenType {
    private final String name;
    private final String regex;

    public TokenType(String name, String regex) {
        this.name = name;
        this.regex = regex;
    }

    public String getName() {
        return name;
    }

    public String getRegex() {
        return regex;
    }

    @Override
    public String toString() {
        return "TokenType{" +
                "name='" + name + '\'' +
                ", regex='" + regex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TokenType)) return false;
        TokenType tokenType = (TokenType) o;
        return Objects.equals(name, tokenType.name) && Objects.equals(regex, tokenType.regex);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (regex != null ? regex.hashCode() : 0);
        return result;
    }
}
