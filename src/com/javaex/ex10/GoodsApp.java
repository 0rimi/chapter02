package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		//int[] intarr = new int[] {12,9,8};
		//숫자를 넣는배열
		
		Goods[] goodsArr = new Goods[3];
		
		Goods camera = new Goods("니콘", 400000);
		goodsArr[0] = camera;
		
		Goods cup = new Goods("머그컵", 2000);
		goodsArr[2]  = cup;
		
		Goods computer = new Goods("LG그램", 900000);
		goodsArr[1]  = computer;
		
		
		//System.out.println(camera.toString());
		//System.out.println(goodsArr[0].toString());
		//세상에 같다!
		
		int count = 0;
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i]);
			if(goodsArr[i]!=null) { //null값있을경우
					count++;
			}
		}
		System.out.println("총 "+count+"개");
		
		System.out.println("=====================");
		//이름만 출력해보자!
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getName());
		}
		
		System.out.println("=====================");
		//showinfo쓰기
		for(int i=0; i<goodsArr.length; i++) {
			goodsArr[i].showinfo();
		}
		
		
	}

}
