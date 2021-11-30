package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("최수빈",22);
		p01.showinfo();
		
		Student s01 = new Student("최연준",23,"한림예고");
		s01.showinfo();
		
		Person ps01 = new Student("최범규",21,"");
		ps01.showinfo();
		System.out.println(ps01.toString());
		

	}

}
