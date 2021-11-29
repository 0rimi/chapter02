package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("최수빈", 21);
		
		Person p02 = new Person();
		p02.setName("최연준");
		p02.setAge(22);
		
		//Person p03 = new Person("휴닝카이",-20);
		
		p01.showinfo();
		p02.showinfo();
		//p03.showinfo();

		Student s01 = new Student();
		s01.setName("최범규");
		s01.setAge(20);
		s01.setSchoolName("한림예술고등학교");
		//s01.showinfo();
		//System.out.println(s01.toString());
		s01.showinfo();
		
		Student s02 = new Student("한림예술고등학교");
		s02.setName("강태현");
		s02.setAge(19);
		//System.out.println(s02.getName());
		//System.out.println(s02.getAge());
		//System.out.println(s02.getSchoolName());
		s02.showinfo();
		
		Student s03  = new Student("휴닝카이",19,"한림예술고등학교");
		//System.out.println(s03.toString());
		s03.showinfo();
		
	}

}
