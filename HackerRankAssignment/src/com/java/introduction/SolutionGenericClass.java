package com.java.introduction;

import java.util.Scanner;

public class SolutionGenericClass {

	 public static void main(String[] args) {
		 Printer myPrinter = new Printer();
	        Integer[] intArray = { 1, 2, 3 };
	        String[] stringArray = {"Hello", "World"};
	        myPrinter.printArray(intArray);
	        myPrinter.printArray(stringArray);
	}
	 
		 
		 
}

class Printer {
	 public <T> void printArray(T[] t) {
		 for(T o :t) {
			 System.out.println(o);
		 }
	 }
}


