package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song star = new Song();
		star.setTitle("어느날 머리에서 뿔이 자랐다");
		star.setArtist("TOMORROW X TOGETER");
		star.setAlbum("꿈의장:STAR");
		star.setComposer("Slow Rabbit");
		star.setYear("2019");
		star.setTrack(2);
		star.showinfo();
		
		
		Song magic = new Song("9와 4분의 3승강장에서 너를 기다려","TOMORROW X TOGETER","꿈의장:MAGIC","Slow Rabbit","2019",2);
		magic.showinfo();
		
		Song eternity = new Song("TOMORROW X TOGETER",2);
		eternity.setTitle("세계가 불타버린 밤, 우린...");
		eternity.setAlbum("꿈의장:ETERNITY");
		eternity.setComposer("Slow Rabbit");
		eternity.setYear("2020");
		eternity.showinfo();
		

	}

}
