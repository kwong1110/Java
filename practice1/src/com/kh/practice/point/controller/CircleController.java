package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
		double calcArea = Math.PI * radius * radius;
		return "���� : " + c.toString() + " / " + calcArea;
	}
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
//		c.setX(x);
//		c.setY(y);
//		c.setRadius(radius);
		double calcCircum = Math.PI * radius * 2;
		return "�ѷ� : " + c.toString() + " / " + calcCircum;
	}
}
