package com.data.structure;

import java.util.Stack;
import java.util.regex.Pattern;
/**
 * Given a string containing just the characters ‘(‘, ‘)’, ‘{‘, ‘}’, ‘[‘ and ‘]’, determine if the input string is valid.
 * 
 * Iterate the given expression from left to right, one character at a time

()()([]({}))[] valid: true
()({]) valid: false
[]{}() valid: true
[(}{)] valid: false
 * 
 * @author vishalpatil
 *
 */
public class ValidatedParenthesesStack {
	static Stack operandStack = new Stack<>();

	public static void main(String[] arg) {
		String parentheseExpression = "[(}{)]";
		System.out.println(parentheseExpression);
		System.out.println(validateParentheseExpression(parentheseExpression));
	}

	private static boolean validateParentheseExpression(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : expression.toCharArray()) {
			if(ch==')' || ch==']' || ch=='}') {
				char ch1 = stack.peek();
				if((ch==')' && ch1=='(') || (ch==']' && ch1=='[') || (ch=='}' && ch1=='{')) {
					stack.pop();
				}
			}else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}	
}
