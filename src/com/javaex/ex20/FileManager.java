package com.javaex.ex20;

import java.io.IOException;

public class FileManager {
	
	/*
	public void readFile() {
		// c://conig.txt 를 읽어오는 메소드
		//System.out.println("읽었습니다");
		
		try {
			System.out.println("강제예외상황");
			throw new IOException(); //파일을 못읽었을때 예외상황발생
		}catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
	}
	*/
	//강제로 에러 발생시키기
	public void readFile() throws IOException {
		System.out.println("강제예외상황발생");
		throw new IOException();
		
	}
		
	

}
