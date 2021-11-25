package com.javaex.ex07;

public class TV {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV() {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	//메소드g/s			
	public int getChannel() {
		System.out.println("channel: "+channel);
		return channel;
	}

	public int getVolume() {
		System.out.println("channel: "+volume);
		return volume;
	}

	
	//메소드일반
	public void power(boolean action) {
		this.power = action;
	}
	
	public void tvstate(){
		System.out.println("전원 : "+power);
		System.out.println("채널 : "+channel);
		System.out.println("볼륨 : "+volume);
	}
	
	
}
