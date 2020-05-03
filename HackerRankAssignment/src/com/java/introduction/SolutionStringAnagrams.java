package com.java.introduction;

import java.util.Scanner;

public class SolutionStringAnagrams {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String A=sc.next();
	        String B=sc.next();
		 	System.out.println(isAnagram(A, B)?"Anagrams":"No Anagrams");
	}

	private static boolean isAnagram(String A, String B) {
		int[] aAscci = new int[26];
		int[] bAscci = new int[26];
		A = A.toUpperCase();
		B = B.toUpperCase();
		if(A.length()!=B.length())
			return false;
		for(int i=0;i<A.length();i++) {
			aAscci[A.charAt(i)-'A']++;
			bAscci[B.charAt(i)-'A']++;
		}
		
		for(int i=0;i<aAscci.length;i++) {
			if(aAscci[i]!=bAscci[i]) {
				return false;
			}
		}
		return true;
	}
}


