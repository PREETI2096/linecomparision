package com.bridgelabz.linecomparision;

public class LineComparison {
	
	static int result;
    
	public  double length1() {
		int x1 = 20 , y1 = 6 ;
		int x2 = 8 , y2 = 7;
		
	    double length1 = Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2- y1, 2));
		return length1;
	}
		
	public double length2() {
		int x3 = 6 , y3 = 9;
		int x4 = 25 , y4 = 45;
		
		Double length2  = Math.sqrt(Math.pow(x4- x3, 2) + Math.pow(y4 - y3, 2));
		
		return length2;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison computation program!");
		
		LineComparison line = new LineComparison();  // creating object
		 
		Double lengthOfLine1  = line.length1();
		System.out.println("Length of first line = " + lengthOfLine1);
		
		Double lengthOfLine2 = line.length2();
		System.out.println("Length of second line = " + lengthOfLine2);
		
		System.out.println(lengthOfLine1.equals(lengthOfLine2));
		
		result = Double.compare(lengthOfLine1, lengthOfLine2);
		
		if(result > 0) {
			System.out.println("First line is greater than second line");
		}
		else if(result < 0) { 
			System.out.println("First line is lesser than second line");
		}
		else
			System.out.println("Both lines are Equal");
		
	}
}
