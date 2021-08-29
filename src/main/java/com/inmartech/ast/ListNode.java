package com.inmartech.ast;

import com.inmartech.token.Token;

public class ListNode implements Node {

    private final Token list;

    public ListNode(Token list) {
        this.list = list;
    }

    @Override
    public String getText() {
        return null;
    }
}
