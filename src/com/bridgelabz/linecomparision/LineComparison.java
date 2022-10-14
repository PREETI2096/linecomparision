package com.bridgelabz.linecomparision;

public class LineComparison {

	//uc2 checking equality of two lines
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison computation program!");
		int x1 = 20 , y1 = 6 ;
		int x2 = 8 , y2 = 7;
		int x3 = 6 , y3 = 9;
		int x4 = 25 , y4 = 45;
		
		Double length1 = Math.sqrt(Math.pow(x2- x1, 2) + Math.pow(y2 - y1, 2));
		Double length2  = Math.sqrt(Math.pow(x4- x3, 2) + Math.pow(y4 - y3, 2));
		
		
		System.out.println("Length of first line = " + length1);
		
		System.out.println("Length of second line = " + length2);
		
		System.out.println(length1.equals(length2));
		
		if(length1.equals(length2)) 
			System.out.println("Both lines have equal length");
		else 
			System.out.println("Both lines have  different length");
		}
		
	}

