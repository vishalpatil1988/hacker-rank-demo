package com.java.introduction;

import java.util.Scanner;

public class SolutionStringSplit {

	 public static void main(String[] args) {
		 	Scanner in = new Scanner(System.in);
	        String s = in.nextLine();
	        in.close();
	        s= s.trim();
	        if (s == null || s.trim().isEmpty() || s.trim().length()==0)
	        {
	        	System.out.println("0");
	        	return;
	        } else if(s.length() > 400000){
	            return;
	        }
	        String[] strArray = s.split("[\\s.,?'!_\\@]+");
	        System.out.println(strArray.length);
	        for(String str : strArray)
	        System.out.println(str);
	}
}


