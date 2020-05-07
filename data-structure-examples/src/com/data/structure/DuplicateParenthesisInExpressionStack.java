package com.data.structure;

import java.util.Stack;
/**
 * Objective: Given an arithmetic expression, write an algorithm to find out whether the expression contains duplicate parenthesis.

Duplicate Parenthesis: Two contiguous parentheses with no elements between them can be called as duplicate parenthesis. 


 * @author vishalpatil
 *
 */
public class DuplicateParenthesisInExpressionStack {
	public static void main(String[] args) {
			System.out.println(isDuplicateParenthesisInExpression("A/(B+C)*D/((E+F))")?"Duplicate Parenthesis found":"No duplicate Parenthesis");
	}
	
	static boolean isDuplicateParenthesisInExpression(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch :expression.toCharArray()) {
			if(ch!=')') {
				stack.push(ch);
			}else {
				int element = 0;
				char pop = (char)stack.pop();
				while(pop!='(') {
					element++;
					pop = stack.pop();
				}
				if(element<=1) {
					return true;
				}
			}
		}
		return false;
	}
}
