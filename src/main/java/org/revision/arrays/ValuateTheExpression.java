package org.revision.arrays;

// Problem Statement
/*You will get a string input "(a-(b+c)+d)" and you have to evaluate the expression
so the output string becomes: a-b-c+d You will have +,-,* signs only in the expression.
One more example is: (p*p) - (a-b) , output will be: p*p-a+b*/


import java.util.Stack;

public class ValuateTheExpression {

    public static void main(String[] args){

        System.out.println(simplifyExpression("(p*p) - (a-b)"));
    }

    public static String simplifyExpression(String expression) {
        Stack<Boolean> signStack = new Stack<>();
        signStack.push(true);  // Start with positive sign
        boolean currentSign = true;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == ' ') {
                // Skip spaces
                continue;
            } else if (ch == '(') {
                // When encountering '(', push the current sign to the stack
                result.append('(');  // Keep the '(' in the output
                signStack.push(currentSign);
            } else if (ch == ')') {
                // Pop the sign stack on encountering ')'
                result.append(')');  // Keep the ')' in the output
                signStack.pop();
            } else if (ch == '+') {
                // Maintain the sign as it is if '+' is encountered
                currentSign = signStack.peek();
                result.append(currentSign ? '+' : '-');
            } else if (ch == '-') {
                // Flip the sign based on the current sign context
                currentSign = !signStack.peek();
                result.append(currentSign ? '+' : '-');
            } else {
                // Append operands and other operators like '*' or variables
                result.append(ch);
            }
        }

        // Remove any leading '+' for neatness
        if (result.length() > 0 && result.charAt(0) == '+') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
