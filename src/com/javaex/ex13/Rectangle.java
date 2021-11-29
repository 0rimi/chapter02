package com.javaex.ex13;

public class Rectangle {
	
	
	//필드
	private String line;
	private String fill;
	private int width;
	private int height;
	
	
	//생성자
	public Rectangle() {
		
	}
	public Rectangle(String line, String fill, int width, int height) {
		this.line = line;
		this.fill = fill;
		this.width = width;
		this.height = height;
	}
	
	
	//메소드 g/s
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getFill() {
		return fill;
	}
	public void setFill(String fill) {
		this.fill = fill;
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

	
	//메소드 일반
	@Override
	public String toString() {
		return "Rectangle [line=" + line + ", Fill=" + fill + ", width=" + width + ", height=" + height + "]";
	}
	public void draw(){
		System.out.println("선 색 "+line+", 면 색 "+fill+", 가로 "+width+"cm, 세로 "+height+"cm인 사각형을 그렸습니다.");
	}
	public void linedraw() {
		System.out.println("선 색 "+line);
	}
	
	

}
