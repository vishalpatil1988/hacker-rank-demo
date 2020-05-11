package com.data.structure;

import java.util.Stack;
/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * 
 * 	Input: S = "ab#c", T = "ad#c"
	Output: true
	Explanation: Both S and T become "ac".
	
	Input: S = "ab##", T = "c#d#"
	Output: true
	Explanation: Both S and T become "".
	
	
	Input: S = "a#c", T = "b"
	Output: false
	Explanation: S becomes "c" while T becomes "b".
 * 
 * @author vishalpatil
 *
 */
public class BackspaceStringCompareStack {

	public static void main(String[] arg) {
		System.out.println(BackspaceStringCompareStack.getBackspaceString("a#c").equals(BackspaceStringCompareStack.getBackspaceString("c#d#")));
	}

	static String getBackspaceString(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : expression.toCharArray()) {
			if (ch == '#' && !stack.isEmpty()) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}

		String str = "";
		while (!stack.isEmpty()) {
			str = str + stack.pop();
		}
		return str;
	}
}
