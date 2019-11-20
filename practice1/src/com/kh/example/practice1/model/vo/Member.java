package com.kh.example.practice1.model.vo;

public class Member {
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {}
	
	
//	public Member(String name) {
//		memberName = name;
//	}
	
	public void changeName(String name) {
		memberName = name;
	}
	
	public void printName() {
		System.out.println("memberName : " + memberName);
	}
}
