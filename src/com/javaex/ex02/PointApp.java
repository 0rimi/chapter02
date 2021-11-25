package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point coor1 = new Point(5);		
		coor1.setX(12);
		//coor1.setY(5);
		coor1.draw();
		
		Point coor2 = new Point(9, 13);		
		//coor2.setX(9);
		//coor2.setY(13);
		coor2.draw();
		
		Point coor3 = new Point(8,14);
		coor3.draw(false);

	}

}
