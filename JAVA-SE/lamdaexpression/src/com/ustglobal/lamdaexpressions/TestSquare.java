package com.ustglobal.lamdaexpressions;

public class TestSquare {
	public static void main(String[] args) {
		SquareInterface squareInterface= (x)->x*x;
		//SquareInterface squareInterface=( x)->x*x; possible
		//SquareInterface squareInterface= (int x)->x*x; possible data type must same as we declared in the abstract method of functional interface
		//SquareInterface squareInterface=int x->x*x; not possible
		int value=squareInterface.square(10);
		System.out.println("square is "+value);
		
	}

}
