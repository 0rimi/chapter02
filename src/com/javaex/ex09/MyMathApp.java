package com.javaex.ex09;

public class MyMathApp {
	
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반

	public static void main(String[] args) {
		
//		MyMath math = new MyMath();
//		
//		int ans1 = math.plus(12, 9);
//		System.out.println(ans1);
//		double ans2 = math.plus(12.5, 9.13);
//		System.out.println(ans2);
//		double ans3 = math.plus(12.5, 23);
//		System.out.println(ans3);
//		double ans4 = math.plus(22,9.13);
//		System.out.println(ans4);
		//plus하나로 다 돌아가는줄 알았겠지만 아닙니도..

		//스태틱을 이용해서 바로 불러와보자..!
		//바로~ 틀 클래스명 적어주면 된다~
		int ans1 = MyMath.plus(12, 9);
		System.out.println(ans1);
		double ans2 = MyMath.plus(12.5, 9.13);
		System.out.println(ans2);
		double ans3 = MyMath.plus(12.5, 23);
		System.out.println(ans3);
		double ans4 = MyMath.plus(22,9.13);
		System.out.println(ans4);
		//plus하나로 다 돌아가는줄 알았겠지만 아닙니도..

		double ans5 = MyMath.circle(3);
		System.out.println(ans5);
		
		double ans6 = MyMath.circlelong(3);
		System.out.println(ans6);
		
	}

}
