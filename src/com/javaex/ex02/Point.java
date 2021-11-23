package com.javaex.ex02;

public class Point {

	private int x;
	private int y;
	
	
	//메소드 이름 setX, getX, setY, getY,draw로출력
	
	public void setX(int xp) {
		if(x>0) {
			this.x = xp;   //여기에 있는 x란 뜻으로 this
		}else {
			this.x = 0;    //if구문도 넣을수 있음
		}
	}
	public void setY(int yp) {
		this.y = yp;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void draw() {
		System.out.println("점 [x="+x+","+" y="+y+"]을 그렸습니다.");
	}
	
	
}
