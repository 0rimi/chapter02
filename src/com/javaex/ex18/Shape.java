package com.javaex.ex18;

public abstract class Shape implements Drawable {
	
	
	//필드
	private String lineColor;
	protected String fillColor;

	
	//생성자
	public Shape() {
		
	}
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	
	//메소드 g/s
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	/*
	public void draw() {
		
	}
	*/
	//인터페이스 클래스로 자녀클래스들을 Drawable로 묶어줌
	
	
	//어케 area일단 만들어야해..
	public abstract double area();
	//단독으로는 안도ㅐ 란 abstract를 클래스이름에
	//추상메소드
	//내부코드를 작성할 수 없는 상황
	//자식 클래스에서는 꼭 내부코드를 구현해야함
	//Shape는 추상클래스가 되었으므로 이 미완성인 부분을 상속받은
	//자식들이 꼭 만들어줘야함
	

}
