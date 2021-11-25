package com.javaex.ex07;

import java.util.Scanner;

public class TVapp {

	public static void main(String[] args) {
		
		TV tv = new TV(7,  20, false);
		tv.power(true);
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		//tv꺼졌을때
		TV tv = new TV(7,  20, false);
		tv.tvstate();
		
		//tv켜졌을때
		
		System.out.println("전원을 켜시겠습니까?");
		System.out.print("y/n : ");
		String ans = sc.nextLine();
		
		if(ans.equals("n")) {//tv꺼짐
			tv.setPower(false);
			tv.tvstate();
		}
		else if(ans.equals("y")) {//tv 켜짐
			tv.setPower(true);
			tv.tvstate();
		}
		
		//채널을 입력받을때
		
		
		
		//int num = sc.nextInt();
		//tv.setChannel(num);
		
		//tv.tvstate();
		
		
		sc.close();
		*/
	}

}
