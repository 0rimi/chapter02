package com.javaex.ex12;

public class ColorPoint extends Point {

	//필드
	private String color; 
	
	//생성자
	public ColorPoint() {
		
	}
	public ColorPoint(String color) {
		this.color = color;
	}
	public ColorPoint(int x, int y,String color) {
		super.setX(x);
		this.y = y; //protected라 가능		
		this.color = color;
	}

	//메소드 g/s
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드
	public void showinfo() {
		System.out.println("점 : "+"("+getX()+","+super.y+")");
		System.out.println("색상 : "+color);
		System.out.println("");
	}
	
}
