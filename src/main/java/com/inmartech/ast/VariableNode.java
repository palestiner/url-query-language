package com.inmartech.ast;

import com.inmartech.token.Token;

public class VariableNode implements Node {
    private final Token var;

    public VariableNode(Token var) {
        this.var = var;
    }

    @Override
    public String getText() {
        return null;
    }
}
