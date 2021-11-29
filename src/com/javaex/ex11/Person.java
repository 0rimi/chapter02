package com.javaex.ex11;

public class Person {
	
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드g/s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		if(age<0) {
			return 1;	
		}
		else {
			return age;
		}
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public void showinfo() {
		//this.name  name getName() this.getName()
		System.out.println("======================");
		System.out.println("이름 : "+getName());
		System.out.println("나이 : "+getAge());
		System.out.println("======================");
	}
	
	
}
