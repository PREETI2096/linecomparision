package com.bridgelabz.linecomparision;

public class LineComparison {

	//uc1 calculating the length of a line
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison computation program!");
		int x1 = 20 , y1 = 6 ;
		int x2 = 8 , y2 = 7;
		
		double length = Math.sqrt(Math.pow(x2- x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of line = " + length);

	}
}
