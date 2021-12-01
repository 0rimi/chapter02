package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Point p01 = new Point(12,9);
		//p01.draw();
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable p02 = new Point(5,13);
		//p02.draw();
		
		Drawable r01 = new Rectangle("검정","파랑",9,43);
		//r01.draw();
		
		Drawable t01 = new TriAngle("파랑","분홍",5,53);
		//t01.draw();
		
		Drawable c01 = new Circle("빨강","검정",817);
		//c01.draw();

		//System.out.println(((TriAngle)t01).getWidth()); //다운캐스팅해서 사용
		
		dArray[0] = p02;
		dArray[1] = r01;
		dArray[2] = t01;
		dArray[3] = c01;
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		/* 면적그리기 하고 싶은데두용..
		for(int i=1; i<dArray.length; i++) {
			System.out.println(((Shape)dArray[i]).area());
		}
		*/
		for(int i=1; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area()); 
			}
		}
		
		
		
	}

}
