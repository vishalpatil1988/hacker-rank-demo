package com.java.introduction;

import java.util.Scanner;

public class SolutionStaticInitializerParallelogram {
	static int B=0;
    static int H=0;
    static boolean flag = true;
    static {
        Scanner sc=new Scanner(System.in);
           B = sc.nextInt();
           H = sc.nextInt();
           try
            { 
               if(B<=0 || H<=0) {
                   flag = false;
                   throw new Exception("java.lang.Exception: Breadth and height must be positive");
               }
            } 
            catch(Exception e) 
            { 
                System.out.println(e.getMessage());
            } 
           sc.close();
    }

	 public static void main(String[] args) {
	       
	       if(flag)
	    	   System.out.println(B*H);
	        
	}
		 
}
