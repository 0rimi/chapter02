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
		
		//System.out.println(IU.toString());
		
		Song BB = new Song();
		
		BB.setTitle("9와 4분의 3승강장에서 너를 기다려");
		BB.setArtist("TOMORROW X TOGETHER");
		BB.setAlbum("꿈의장:MAGIC");
		BB.setComposer("Slow Rabbit");
		BB.setYear("2019");
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
