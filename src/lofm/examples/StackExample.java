package lofm.examples;

import java.util.Stack;

public class StackExample {

    public boolean verifyParenthesis(String message) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        while (i < message.length()) {
            if(message.charAt(i)=='(') {
                stack.push("(");
            } else if  (message.charAt(i)==')') {
                //Verify we don't start with closing parenthesis
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    stack.push(")");
                    break;
                }
            }
            i++;
        }

        //Issue in Stack class
        //stack.add(2, "Random element");

        return stack.empty();
    }
}
