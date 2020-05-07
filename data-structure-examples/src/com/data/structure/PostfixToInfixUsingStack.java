package com.data.structure;

import java.util.Stack;
import java.util.regex.Pattern;
/**
 * 
 * Iterate the given expression from left to right, one character at a time

1.	If a character is operand, push it to stack.
2.	If a character is an operator, 
3.	pop operand from the stack, say it’s s1.
4.	pop operand from the stack, say it’s s2.
5.	perform (s2 operator s1) and push it to stack.
6.	Once the expression iteration is completed, initialize the result string and pop out from the stack and add it to the result.
7.	Return the result.
 * 
 * @author vishalpatil
 *
 */
public class PostfixToInfixUsingStack {
	static Stack operandStack = new Stack<>();

	public static void main(String[] arg) {
		String postFixStr = "ABC/-AK/L-*";
		char[] postfixCharArray = postFixStr.toCharArray();
		System.out.println(postFixStr);
		System.out.println(postfixToInfix(postfixCharArray));
	}

	private static String postfixToInfix(char[] postfixCharArray) {
		for (char ch : postfixCharArray) {
			if (isOperand(ch)) {
				PostfixToInfixUsingStack.operandStack.push(ch+"");
			} else {
				String str1 = (String)PostfixToInfixUsingStack.operandStack.pop();
				String str2 = (String)PostfixToInfixUsingStack.operandStack.pop();
				PostfixToInfixUsingStack.operandStack.push('('+str2+ch+str1+')');
			}
		}
		
		return PostfixToInfixUsingStack.printStack();
	}

	private static boolean isOperand(char operand) {
		return Pattern.matches("[a-zA-Z]", operand + "");
	}
	
	private static String printStack() {
		String postfixStr="";
		while(!PostfixToInfixUsingStack.operandStack.isEmpty()) {
			postfixStr = postfixStr + (String) PostfixToInfixUsingStack.operandStack.pop();
		}
		return postfixStr;
	}
}
