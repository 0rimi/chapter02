package com.javaex.ex03;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song IU = new Song();
		
		IU.settitle("좋은날");
		IU.setartist("아이유");
		IU.setalbum("Real");
		IU.setcomposer("이민수");
		IU.setyear("2010");
		IU.settrack(3);
		IU.showinfo();
		
		Song BB = new Song();
		
		BB.settitle("거짓말");
		BB.setartist("BIGBANG");
		BB.setalbum("Always");
		BB.setcomposer("G-DRAGON");
		BB.setyear("2007");
		BB.settrack(2);
		BB.showinfo();
		
		Song Busker = new Song();
		
		Busker.settitle("벚꽃엔딩");
		Busker.setartist("버스커버스커");
		Busker.setalbum("버스커버스커1집");
		Busker.setcomposer("장범준");
		Busker.setyear("2012");
		Busker.settrack(4);
		Busker.showinfo();
		
		
		
		
	}

}
