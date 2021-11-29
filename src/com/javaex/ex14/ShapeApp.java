package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle[] rArray = new Rectangle[3];
		//부모클래스 생성자 확인해보기
		//Shape s01 = new Shape("갈색","갈색");
		//System.out.println(s01.toString());
		
		Rectangle r01 = new Rectangle("갈색","갈색",3,4);
		//System.out.println(r01.toString());
		Rectangle r02 = new Rectangle("갈색","은회색",4,25);
		Rectangle r03 = new Rectangle("검정","파랑",10,21);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i=0; i<rArray.length; i++) {
				rArray[i].draw();
		}
		
		///////////////////////////////////////////////
		
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("보라","노랑",5);
		Circle c02 = new Circle("파랑","분홍",10);
		Circle c03 = new Circle("검정","빨강",5);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
				cArray[i].draw();
		}
		
		///////////////////////////////////////
		
		TriAngle[] tArray = new TriAngle[3];
		
		TriAngle t01 = new TriAngle("검정","검정",5,31);
		TriAngle t02 = new TriAngle("빨강","검정",8,17);
		TriAngle t03 = new TriAngle("빨강","갈색",12,1);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i=0; i<tArray.length; i++) {
		tArray[i].draw();
		}

		
		
	}

}
