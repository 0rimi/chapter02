package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArray  = new Shape[3];
		
		Shape s01 = new Rectangle("파랑", "분홍",5,53); 
		//s01.draw();
		
		Shape c01 = new Circle("검정", "검정", 817);
		//c01.draw();
		
		Shape t01 = new TriAngle("검정","파랑",10,17);
		//01.draw();
		
		
		sArray[0] = s01;
		sArray[1] = c01;
		sArray[2] = t01;

		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//강제형변환(캐스팅) > Circle 필드값 get할수잇음
		((Circle)c01).getRadius();
		
		
		
		
	}

}
