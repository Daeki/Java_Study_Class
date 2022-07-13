package com.iu.object1.ex1;

public class StudentView {
	
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	public void viewAll(Student [] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].num);
			System.out.println(students[i].total);
			System.out.println(students[i].avg);
		}
		
		
	}
	

}
