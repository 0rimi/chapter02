package com.javaex.ex15;

public class Rectangle extends Shape{
	
	//필드
	//부모꺼훔칠거임
	private int width;
	private int height;
	
	//부모고려 생성자 만들기
	public Rectangle() {
		super();	//Shape 기본생성자 Shape();		
	}
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}
	
	
	//메소드 g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + super.getLineColor()
				+ ", getFillColor()=" + super.getFillColor() + "]";
	}
	public void draw() {
		System.out.println("길이 " + width + "cm, 높이 " + height + "cm, 선 색 " + super.getLineColor()
		+ ", 면 색 " + super.getFillColor() + "인 사각형을 그렸습니다.");
	}
	

}
