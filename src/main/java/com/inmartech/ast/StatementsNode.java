package com.inmartech.ast;

import java.util.ArrayList;
import java.util.List;

public class StatementsNode implements Node {
    private final List<Node> nodes = new ArrayList<>();

    public void addNode(Node node) {
        nodes.add(node);
    }

    public StatementsNode() {
    }

    @Override
    public String getText() {
        return null;
    }
}
