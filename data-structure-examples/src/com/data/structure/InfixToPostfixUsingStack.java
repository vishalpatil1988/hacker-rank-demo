package com.data.structure;

import java.util.Stack;
import java.util.regex.Pattern;

public class InfixToPostfixUsingStack {
	static Stack operandStack = new Stack<>();

	public static void main(String[] arg) {
		String infixStr = "A*B+C*D";
		char[] infixStrChar = infixStr.toCharArray();
		String postfixStr = new String();
		System.out.println(infixStrChar.length);
		postfixStr = infixToPostfix(infixStrChar, postfixStr);
		System.out.println(postfixStr);
	}

	private static String infixToPostfix(char[] infixStrChar, String postfixStr) {
		for (char ch : infixStrChar) {
			if (isOperand(ch)) {
				postfixStr = postfixStr + ch;
			} else {
				if (!InfixToPostfixUsingStack.operandStack.isEmpty()
						&& isHigherPrecedence((char) InfixToPostfixUsingStack.operandStack.peek())) {
					postfixStr = postfixStr + (char) InfixToPostfixUsingStack.operandStack.pop();
				}
				InfixToPostfixUsingStack.operandStack.push(ch);
			}
		}
		while (!InfixToPostfixUsingStack.operandStack.isEmpty()) {
			postfixStr = postfixStr + (char) InfixToPostfixUsingStack.operandStack.pop();
		}
		return postfixStr;
	}

	private static boolean isHigherPrecedence(char operator) {
		return "*/".contains(operator + "");
	}

	private static boolean isOperand(char operand) {
		return Pattern.matches("[a-zA-Z]", operand + "");
	}
}
