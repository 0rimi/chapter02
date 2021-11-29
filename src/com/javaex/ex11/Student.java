package com.javaex.ex11;

public class Student extends Person{//Person받아먹기
	
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
	
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	public Student(String name,int age, String schoolName) {
		//super(); //부모의 생성자 실행
		super(name, age);
		//super.setName(name); //부모의 name이란뜻.
		//super.setAge(age);
		this.schoolName = schoolName;
	}
	
	//메소드 g/s 
	public String getSchoolName(){
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	public void showinfo() {
		System.out.println("======================");
		System.out.println("이름 : "+getName());
		System.out.println("나이 : "+getAge());
		System.out.println("학교 : "+getSchoolName());
		System.out.println("======================");
	}
	
	
	
}
