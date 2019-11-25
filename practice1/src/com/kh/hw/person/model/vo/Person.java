package com.kh.hw.person.model.vo;

public class Person {

	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 이름
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// 나이
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	// 키(길이)
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	// 몸무게
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return name + ", " + age + ", " + height + ", " + weight;
	}
}
