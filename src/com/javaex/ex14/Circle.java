package com.javaex.ex14;

public class Circle extends Shape {
	
	
	//필드
	private int radius;


	//생성자
	public Circle() {
		
	}
	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}
	
	
	//메소드 g/s
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	} 
	
	
	//메소드 일반
	public void draw() {
		System.out.println("반지름 " + radius + "cm, 선 색 " + super.getLineColor()
		+ ", 면 색 " + super.getFillColor() + "인 원을 그렸습니다.");
	}
	

}
