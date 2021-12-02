package com.javaex.ex19;

import java.util.Scanner;

public class ArithException {
	
	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
		result = 100/num;
		System.out.println(result);
		}catch(ArithmeticException e) {//컨트롤스페이스..
			System.out.println("0으로 나눌수 없습니다."); //저런 상황에서 이렇게 처리!
		}finally {
			System.out.println("finally영역"); //무좍건 실행 문장 
		}
		
		
		sc.close();
		
		
	}

}
