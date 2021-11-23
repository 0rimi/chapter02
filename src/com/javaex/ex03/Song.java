package com.javaex.ex03;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자
	
	
	
	//메소드 - g/s(알트쉬프트에스-제너레이트게터세터)
	public void setTitle(String n) {
		this.title = n;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public String getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	public void setArtist(String n) {
		this.artist = n;
	}
	public void setAlbum(String n) {
		this.album = n;
	}
	public void setComposer(String n) {
		this.composer = n;
	}
	public void setYear(String n) {
		this.year = n;
	}
	public void setTrack(int n) {
		this.track = n;
	}
	
	
	public String settitle() {
		return title;
	}
	public String setartist() {
		return artist;
	}
	public String setalbum() {
		return album;
	}
	public String setcomposer() {
		return composer;
	}
	public String setyear() {
		return year;
	}
	public int settrack() {
		return track ;
	}
	
	//메소드(제너레이터 투 스트링:확인용)
	public void showinfo(){
		System.out.println(artist+", "+title+"( "+album+", "+year+", "+track+"번 track"+", "+composer+" 작곡 )");
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
	

}
