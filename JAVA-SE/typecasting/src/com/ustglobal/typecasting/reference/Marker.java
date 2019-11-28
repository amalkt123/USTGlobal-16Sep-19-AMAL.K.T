package com.ustglobal.typecasting.reference;

public class Marker extends Pen{
	double size;
	void color() 
	{
		System.out.println("marker color() method");
	}
@Override
void write() {
    
	System.out.println("marker write() method");
}
}
