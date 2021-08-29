package com.inmartech.ast;

import com.inmartech.token.Token;

public class ExpressionNode implements Node {

    private final Token expression;

    public ExpressionNode(Token expression) {
        this.expression = expression;
    }

    @Override
    public String getText() {
        return null;
    }
}
