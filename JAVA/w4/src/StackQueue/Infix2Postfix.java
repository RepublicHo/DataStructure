package StackQueue;

import java.util.Stack;

/**
 * @Author Anthony Z.
 * @Date 1/6/2022
 * @Description:
 */
public class Infix2Postfix {
    // Get precedence
    static int prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }
     static String infix2Postfix(String exp){
        String result = "";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<exp.length(); i++){

        }

        return result;
     }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

    }
}
