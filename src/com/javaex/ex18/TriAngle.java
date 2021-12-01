package com.javaex.ex18;

public class TriAngle extends Shape implements Drawable{
	
	
	
	private int width;
	private int height;
	
	
	public TriAngle() {
		
	}
	public TriAngle(String lineColor, String fillColor,  int width, int height) {
		super(lineColor,fillColor);
		this.width = width;
		this.height = height;
	}
	
	
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
	
	
	
	@Override
	public String toString() {
		return "TriAngle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	public void draw() {
		System.out.println("길이 " + this.width + "cm, 높이 " + this.height + "cm, 선 색 " + super.getLineColor()
		+ ", 면 색 " + super.getFillColor() + "인 삼각형을 그렸습니다.");
	}
	public double area() {
		double result = width*height*0.5;
		return result;
	}
	

}
