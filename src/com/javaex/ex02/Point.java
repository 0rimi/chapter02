package com.javaex.ex02;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() { //클래스 이름
		//해당클래스를 메모리에 올리는 일
		//안써도 작동함.
		//디폴트생성자라 다른 생성자가 생기면 없어짐.
		//System.out.println("Point()");
	}
	
	public Point(/*int x, */int y) {
		//this.x = x;
		this.y  = y;
		//System.out.println("Point(1)");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y  = y;
		//System.out.println("Point(2)");
	}
	
	
	//메소드 이름 setX, getX, setY, getY,draw로출력
	
	public void setX(int x) {
		if(x>0) {
			this.x = x;   //여기에 있는 x란 뜻으로 this
		}else {
			this.x = 0;    //if구문도 넣을수 있음
		}
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//메소드
	public void draw() {
		System.out.println("점 [x="+x+","+" y="+y+"]을 그렸습니다.");
	}
	
	//action에 true가 오면 그리고, 아니면 지우는 기능. 
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점 [x="+x+","+" y="+y+"]을 그렸습니다.");
		}
		else if(action == false){
			System.out.println("점 [x="+x+","+" y="+y+"]을 지웠습니다.");	
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	
}
