package com.javaex.ex08;

public class Goods {
	
	//필드
	private String name;
	private int price;
	private static int sum;
	//메모리에 올라갈때마다 공통으로 쓰는 필드라는 표시가 필요
	//그게바로 static
	
	//생성자
	public Goods() {
		this.sum++;
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.sum++;
	}
	
	//메소드g/s
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getSum() {
		return sum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

	//메소드일반
	
	public void showinfo() {
		System.out.println("상품명 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("=============");
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", sum=" + sum + "]";
	}

}
