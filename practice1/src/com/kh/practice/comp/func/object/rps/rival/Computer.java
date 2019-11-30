package com.kh.practice.comp.func.object.rps.rival;

public class Computer {

	// ��ǻ���� ���� ���� �� ��ǻ���� ��������������.
	
	private String comRps;
	private int win;
	private int draw;
	private int lose;
	private int total;
	
	public Computer() {}
	public Computer(String comRps, int total, int win, int draw, int lose) {
		this.comRps = comRps;
		this.total = total;
		this.win = win;
		this.draw = draw;
		this.lose = lose;
	}
	
	public void resetComRps() {
		this.comRps = null;
	}
	
	public String getComRps() {
		return comRps;
	}
	public void setComRps() {
		int ranRps = (int)(Math.random() * 3);
		
		switch(ranRps) {
		case 0: this.comRps = "����"; break;
		case 1: this.comRps = "����"; break;
		case 2: this.comRps = "��"; break;
		}
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	
	
}
