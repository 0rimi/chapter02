package com.javaex.ex01;

public class Goods {
	
		private String name;
		private int price;


		//메소드
		
		public void setName(String n) {
			name = n;
		}
		public void setPrice(int p) {
			price = p;
		}
//		public String getName() {
//			return name;
//		}
//		public int getPrice() {
//			return price;
//		}
		public void showinfo() {
			System.out.println("상품명 : "+name);
			System.out.println("가격 : "+price);
			System.out.println("");
		}
		
	}


