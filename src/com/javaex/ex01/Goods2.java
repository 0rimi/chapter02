package com.javaex.ex01;

public class Goods2 {
	
	//필드
	//상품(카메라,티비,옷)정보.
	private String name;
	private int price;
	
	//생성자
	
	//메소드
	//private는 한 클래스 안에서만 작동
	public void setName(String n) {
		name = n;//받은 n값을 name에 넣겟다
		//return 생략>void
	}  			
	public String getName() {//return자료형은String
		return name;
	}
	
	public void setPrice(int n) {
		price = n;
	}
	public int getPrice() {
		return price;
	}
	public void showinfo() {
		System.out.println("상품명 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("===================");
	}
	

	
	}
