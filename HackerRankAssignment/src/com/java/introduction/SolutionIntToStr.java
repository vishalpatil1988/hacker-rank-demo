package com.java.introduction;

import java.util.Scanner;

public class SolutionIntToStr {


	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int intNo = sc.nextInt();
        String str = String.valueOf(intNo);
       
        if (intNo == Integer.parseInt(str)) {
            System.out.println("Good job");
           } else {
            System.out.println("Wrong answer.");
           }
}
		 
}
