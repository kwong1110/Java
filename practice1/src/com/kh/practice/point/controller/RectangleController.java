package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// r = new Rectangle(x, y, height, width);
		// 매개변수 생성자를 이용. -> 코드량이 줄어듬.
		int calcArea = width * height;
		return "면적 : " + r.toString() + " / " + calcArea;
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// r = new Rectangle(x, y, height, width);
		int calcPerimeter = 2 * (width + height);
		return "둘레 : " + r.toString() + " / " + calcPerimeter;
	}
}
