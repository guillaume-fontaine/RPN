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
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "SQRT" :
                case "MAX":
                case "/":
                    throw new UnsupportedOperationException(token);
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
