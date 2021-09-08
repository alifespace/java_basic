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

//		Print Grade 3 list
		System.out.println("*****Grade 3 List******");
		for (Student Student1: studClass) {
			if (Student1.studentGrade == 3) {
				System.out.println(Student1.getInfo());
			}
		}
// Print Score List
		System.out.println("***** Student's Score List*****");
		for (int i = 0; i < studClass.length - 1; i++) {
			for (int j = i + 1; j < studClass.length; j++) {
				if (studClass[j].studentScore < studClass[i].studentScore) {
					Student Temp = studClass[j];
					studClass[j] = studClass[i];
					studClass[i] = Temp;
				}
			}
// Test234
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
		studentNo = i + 1;
		studentGrade = (int) (Math.random() * j + 1);
		studentScore = (int) (Math.random() * k + 1);
	}

	public String getInfo() {
		return ("学号：" + studentNo + "\t年级：" + studentGrade + "\t成绩：" + studentScore);
	}
}
