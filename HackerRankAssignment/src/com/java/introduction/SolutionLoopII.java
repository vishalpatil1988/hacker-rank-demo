package com.java.introduction;

import java.util.Scanner;

public class SolutionLoopII {


	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("================================");
	        for(int i=0;i<3;i++){
	            String s1=sc.next();
	            int x=sc.nextInt();
	            if(s1.length()<=10 && (x>=0 && x <=999)){
	            	System.out.println(String.format("%-15s", s1) + String.format("%03d", x));
	            }
	            
	        }
	        System.out.println("================================");

	}
		 
}
