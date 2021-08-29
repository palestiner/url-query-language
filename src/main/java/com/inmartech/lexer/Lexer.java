package com.inmartech.lexer;

import com.inmartech.token.Token;
import com.inmartech.token.type.TokenTypeConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Lexer {
    private final String query;
    private int position = 0;
    private final List<Token> tokenList = new ArrayList<>();

    public Lexer(String query) {
        this.query = query;
    }

    public List<Token> lexAnalysis() {
        while (nextToken()) {

        }
        return getTokenList();
    }

    private boolean nextToken() {
        if (position >= query.length()) {
            return false;
        }
        TokenTypeConstants[] tokenTypes = TokenTypeConstants.values();
        for (TokenTypeConstants type : tokenTypes) {
            Pattern pattern = Pattern.compile("^" + type.getRegex());
            Matcher result = pattern.matcher(query.substring(position));
            if (result.lookingAt() && !"".equals(result.group())) {
                String group = result.group();
                Token token = new Token(type.getType(), group, position);
                position += group.length();
                tokenList.add(token);
                return true;
            }
        }
        throw new RuntimeException("Error detected at position " + position);
    }

    public String getQuery() {
        return query;
    }

    public int getPosition() {
        return position;
    }

    public List<Token> getTokenList() {
        return tokenList.stream()
                .filter(token -> !token.getType().equals(TokenTypeConstants.SPACE.getType()))
                .collect(Collectors.toList());
    }
}
