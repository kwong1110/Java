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
		// �Ű����� �����ڸ� �̿�. -> �ڵ差�� �پ��.
		int calcArea = width * height;
		return "���� : " + r.toString() + " / " + calcArea;
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// r = new Rectangle(x, y, height, width);
		int calcPerimeter = 2 * (width + height);
		return "�ѷ� : " + r.toString() + " / " + calcPerimeter;
	}
}
