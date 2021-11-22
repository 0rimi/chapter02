package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	
	//메소드
	
	public void settitle(String n) {
		title = n;
	}
	public void setartist(String n) {
		artist = n;
	}
	public void setalbum(String n) {
		album = n;
	}
	public void setcomposer(String n) {
		composer = n;
	}
	public void setyear(String n) {
		year = n;
	}
	public void settrack(int n) {
		track = n;
	}
	
	public void showinfo(){
		System.out.println(artist+", "+title+"( "+album+", "+year+", "+track+"번 track"+", "+composer+" 작곡 )");
	}
	
	

}
