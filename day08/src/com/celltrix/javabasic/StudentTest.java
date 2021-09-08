package com.celltrix.javabasic;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("关于学生的测试案例！");
		System.out.println("*********************");

		Student[] studClass = new Student[20];

		for (int i = 0; i < studClass.length; i++) {
			studClass[i] = new Student();
		}
	}
}

class Student {
	int studentNo = 0;
	int studentGrade = 0;
	int studentScore = 0;
}
