package com.javaex.ex03;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song IU = new Song();
		
		IU.setTitle("좋은날");
		IU.setArtist("아이유");
		IU.setAlbum("Real");
		IU.setComposer("이민수");
		IU.setYear("2010");
		IU.setTrack(3);
		IU.showinfo();
		
		System.out.println(IU.toString());
		
		Song BB = new Song();
		
		BB.setTitle("거짓말");
		BB.setArtist("BIGBANG");
		BB.setAlbum("Always");
		BB.setComposer("G-DRAGON");
		BB.setYear("2007");
		BB.setTrack(2);
		BB.showinfo();
		
		Song Busker = new Song();
		
		Busker.setTitle("벚꽃엔딩");
		Busker.setArtist("버스커버스커");
		Busker.setAlbum("버스커버스커1집");
		Busker.setComposer("장범준");
		Busker.setYear("2012");
		Busker.setTrack(4);
		Busker.showinfo();
		
		
		
		
	}

}
