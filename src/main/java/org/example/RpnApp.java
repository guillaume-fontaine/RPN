package org.example;

import java.util.Stack;

public class RpnApp {

    public static void main(String[] args) {

    }

    public static int evaluate(String expression) {
        //Une expression est séparé par un ou plusieurs espaces
        //On utilise une pile pour stocké les chiffres
        //On divise l'expression avec une regex sur les espaces
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        return 0;
    }
}
