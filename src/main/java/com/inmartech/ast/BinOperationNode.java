package com.inmartech.ast;

import com.inmartech.token.Token;

public class BinOperationNode implements Node {

    private final Token operator;
    private final Node leftNode;
    private final Node rightNode;

    public BinOperationNode(Token operator, Node leftNode, Node rightNode) {
        this.operator = operator;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public String getText() {
        return null;
    }
}
