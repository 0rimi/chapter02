package com.javaex.ex09;

public class MyMath {
	
	//필드(필요x)
	private static double pi=3.14159;
	
	//생성자 - 디폴트
	
	//메소드 g/s(필드x)
	
	//메소드 일반
//	public int plus(int a,int b) { 
//		return a+b;
//	}
//	public double plus(double a, double b) {
//		return a+b;
//	}
//	public double plus(double a, int b) {
//		double sum = a+b;
//		return sum;
//	}
//	public double plus(int a, double b) {
//		return a+b;
//	}
	//스태틱을 넣어보자..!
	public static int plus(int a,int b) { 
		return a+b;
	}
	public static double plus(double a, double b) {
		return a+b;
	}
	public static double plus(double a, int b) {
		double sum = a+b;
		return sum;
	}
	public static double plus(int a, double b) {
		return a+b;
	}
	public static double circle(int radius) {
		double area = radius*radius*pi;
		return area;
	}
	public static double circlelong(int radius) {
		return radius*2*pi ;
	}

}
