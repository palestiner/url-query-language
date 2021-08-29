package com.inmartech;

import com.inmartech.lexer.Lexer;

public class Main {
    public static void main(String[] args) {
        int pos = 0;
        String query = "(a EQ b) AND (c GTE d) OR e IN [zxc]";
        Lexer lexer = new Lexer(query);
        lexer.lexAnalysis().forEach(System.out::println);
    }
}
