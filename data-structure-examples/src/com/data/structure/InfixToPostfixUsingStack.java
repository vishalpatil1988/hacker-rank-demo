package com.data.structure;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * Initialize result as a blank string, Iterate through given expression, one character at a time

If the character is an operand, add it to the result.
If the character is an operator.
If the operator stack is empty then push it to the operator stack.
Else If the operator stack is not empty,
If the operator’s precedence is greater than or equal to the precedence of the stack top of the operator stack, then push the character to the operator stack.
If the operator’s precedence is less than the precedence of the stack top of operator stack then “pop out an operator from the stack and add it to the result until the stack is empty or operator’s precedence is greater than or equal to the precedence of the stack top of operator stack“. then push the operator to stack.
If the character is “(“, then push it onto the operator stack.
If the character is “)”, then “pop out an operator from the stack and add it to the result until the corresponding “(“ is encountered in operator stack. Now just pop out the “(“.
Once the expression iteration is completed and the operator stack is not empty, “pop out an operator from the stack and add it to the result” until the operator stack is empty.  The result will be our answer, postfix expression.
 * 
 * 
**/
public class InfixToPostfixUsingStack {

	public static void main(String[] args) {
		String exp = "A+B*(C^D-E)";
		System.out.println("Infix Expression: " + exp);
		System.out.println("Postfix Expression: " + infixToPostFix(exp));
	}

	static String infixToPostFix(String expression) {

		String result = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			// check if char is operator
			if (precedence(c) > 0) {
				while (stack.isEmpty() == false && precedence(stack.peek()) >= precedence(c)) {
					result += stack.pop();
				}
				stack.push(c);
			} else if (c == ')') {
				char x = stack.pop();
				while (x != '(') {
					result += x;
					x = stack.pop();
				}
			} else if (c == '(') {
				stack.push(c);
			} else {
				// character is neither operator nor (
				result += c;
			}
		}
		for (int i = 0; i <= stack.size(); i++) {
			result += stack.pop();
		}
		return result;
	}

	static int precedence(char c) {
		switch (c) {
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

}
