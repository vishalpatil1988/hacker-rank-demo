package com.java.introduction;

import java.util.Scanner;

public class SolutionStringPalidrom {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String reverseStr="";
	        for(int i=A.length()-1;i>=0;i--) {
	        	reverseStr=reverseStr+A.charAt(i);
	        }
	        if(reverseStr.equals(A)) {
	        	System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
	  
	}
}


