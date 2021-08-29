package com.inmartech.parser;

import com.inmartech.ast.*;
import com.inmartech.token.Token;
import com.inmartech.token.type.TokenTypeConstants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser {
    private final List<Token> tokens;
    private int position = 0;
    private final Map<String, String> scope = new HashMap<>();

    public Parser(List<Token> tokens) {
        this.tokens = tokens;
    }

    private Token match(TokenTypeConstants... expected) {
        if (position < tokens.size()) {
            Token currentToken = tokens.get(position);
            for (TokenTypeConstants constant : expected) {
                if (constant.getName().equals(currentToken.getType().getName())) {
                    position += 1;
                    return currentToken;
                }
            }
        }
        return null;
    }

    public Token require(TokenTypeConstants... expected) {
        Token token = match(expected);
        if (token == null) {
            throw new RuntimeException("At position " + position + expected[0].getName() + " is expected");
        }
        return token;
    }

    private Token getOperator() {
        return match(TokenTypeConstants.EQUALS,
                TokenTypeConstants.NOT_EQUALS,
                TokenTypeConstants.GTE,
                TokenTypeConstants.LTE,
                TokenTypeConstants.GT,
                TokenTypeConstants.LT);
    }

    public Node parseQuery() {
        StatementsNode root = new StatementsNode();
        while (position < tokens.size()) {
            Node node = parseExpression();
            root.addNode(node);
        }
        return root;
    }

    private Node parseExpression() {
        return null;
    }

    private Node parseExpressionNode() {
        return null;
    }

    private Node parseBinaryNode() {
        return null;
    }

    private Node parseVarOrExpressionNode() {
        return null;
    }
}
