package com.kh.practice.point.model.vo;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// �ʺ�
	public void setWidth(int width) {
		this.width = width;
	}
	public int width() {
		return width;
	}
	
	// ����
	public void setHeight(int height) {
		this.height = height;
	}
	public int height() {
		return height;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + height + ", " + width;
	}
}
