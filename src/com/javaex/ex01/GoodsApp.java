package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showinfo();
		
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		computer.showinfo();
		
		Goods cup = new Goods();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.showinfo();
		
		
		
		
		
		
	}
	

}
