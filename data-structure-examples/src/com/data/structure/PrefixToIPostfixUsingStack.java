package com.data.structure;

import java.util.Stack;
import java.util.regex.Pattern;
/**
 Iterate the given expression from right to left, one character at a time

1. If the character is operand, push it to the stack.
2. If the character is operator,
3. Pop an operand from the stack, say it’s s1.
4. Pop an operand from the stack, say it’s s2.
5. perform (s1 s2 operator) and push it to stack.
6. Once the expression iteration is completed, initialize the result string and pop out from the stack and add it to the result.
7. Return the result.

 * @author vishalpatil
 *
 */
public class PrefixToIPostfixUsingStack {
	static Stack operandStack = new Stack<>();

	public static void main(String[] arg) {
		String preFixStr = "*-A/BC-/AKL";
		char[] prefixCharArray = preFixStr.toCharArray();
		System.out.println(preFixStr);
		System.out.println(prefixToPostfix(prefixCharArray));
	}

	private static String prefixToPostfix(char[] postfixCharArray) {
		for (int i = postfixCharArray.length-1; i >=0 ; i--) {
			if (isOperand(postfixCharArray[i])) {
				PrefixToIPostfixUsingStack.operandStack.push(postfixCharArray[i]+"");
			} else {
				String s1 = (String)PrefixToIPostfixUsingStack.operandStack.pop();
				String s2 = (String)PrefixToIPostfixUsingStack.operandStack.pop();
				PrefixToIPostfixUsingStack.operandStack.push(s1+s2+postfixCharArray[i]);
			}
		}
		
		return PrefixToIPostfixUsingStack.printStack();
	}

	private static boolean isOperand(char operand) {
		return Pattern.matches("[a-zA-Z]", operand + "");
	}
	
	private static String printStack() {
		String postfixStr="";
		while(!PrefixToIPostfixUsingStack.operandStack.isEmpty()) {
			postfixStr = postfixStr + (String) PrefixToIPostfixUsingStack.operandStack.pop();
		}
		return postfixStr;
	}
}
