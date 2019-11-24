package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	private Student[] sArr = new Student[5];
	public static int CUT_LINE = 60;
	
	
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	public Student[] printStudent() {
//		for(int i = 0; i < sArr.length; i++) {} -> 이렇게 되면 반환값이 Student[]와 일치하게 해줄수가 없음.
			return sArr;
	}
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	public double[] avgScore() {
		double[] avg = new double[2];
		avg[0] = sumScore();
		avg[1] = sumScore() / sArr.length;	
		// avg라는 배열에 getScore가 각 각 들어있는거 (이건 아님)
//		double[] avg = new double[sArr.length];
//		for(int i = 0; i < sArr.length; i++) {
//			avg[i] = sArr[i].getScore();
//		}
		return avg;
	}
}
