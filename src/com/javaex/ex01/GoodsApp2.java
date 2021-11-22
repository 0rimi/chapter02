package com.javaex.ex01;

public class GoodsApp2 {

	public static void main(String[] args) {
		
		
		Goods2 camera = new Goods2(); 
		
		camera.setName("니콘"); //public void n에 담김
		//System.out.println(camera.getName());
		camera.setPrice(400000);
		//System.out.println(camera.getPrice());
		camera.showinfo();
		
		Goods2 computer = new Goods2();
		
		computer.setName("LG그램");
		computer.setPrice(900000);
		computer.showinfo();
		
		Goods2 cup = new Goods2();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.showinfo();
		
	}
	
		

}
