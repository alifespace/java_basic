package com.celltrix.javabasic;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("关于学生的测试案例！");
		System.out.println("*********************");

		Student[] studClass = new Student[20];

		for (int i = 0; i < studClass.length; i++) {
			studClass[i] = new Student(i, 3, 100);
		}

		for (Student Student1: studClass) {
			System.out.println(Student1.getInfo());
		}
	}

}

class Student {
	int studentNo;
	int studentGrade;
	int studentScore;

	public Student(int i, int j, int k) {
		studentNo = i;
		studentGrade = (int) (Math.random() * j + 1);
		studentScore = (int) (Math.random() * k + 1);
	}

	public String getInfo() {
		return ("学号：" + studentNo + "\t年级：" + studentGrade + "\t成绩：" + studentScore);
	}
}
