package com.kh.hw.member.model.vo;

public class Member {
	
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	public Member() {}
	public Member(String id, String name, String password,
			String email, char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	// id
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	// 이름
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// 비번
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	// 이메일
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	// 성별
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}

	// 나이
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public String inform() {
		return id + " " + name + " " + password + " " + email + " "
				+ gender + " " + age;
	}
}
