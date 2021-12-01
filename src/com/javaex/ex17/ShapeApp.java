package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Rectangle r01 = new Rectangle("갈색","갈색",3,4);
		System.out.println(r01.area());
		
		Circle c01 = new Circle("갈색","은회색",5);
		System.out.println(c01.area());
		
		TriAngle t01 = new TriAngle("검정","파랑",10,17);
		System.out.println(t01.area());
		
		*/
		
		Shape[] sArray = new Shape[3]; 
		
		Shape r01 = new Rectangle("갈색","갈색",3,4);
		//System.out.println(r01.area());
		
		Shape c01 = new Circle("갈색","은회색",5);
		//System.out.println(c01.area());
		
		Shape t01 = new TriAngle("검정","파랑",10,17);
		//System.out.println(t01.area());
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
			
		
	}

}
