package com.kh.practice.comp.func.object.rps.rival;

public class User {

	// 유저의 전적 저장
	
	private int win = 0;
	private int draw = 0;
	private int lose = 0;
	private int total = 0;
	
	public User(){}

	public User(int total, int win, int draw, int lose) {
		this.total = total;
		this.win = win;
		this.draw = draw;
		this.lose = lose;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = this.draw + this.lose + this.win;
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

	@Override
	public String toString() {
		setTotal();
		return total + "전 " + win + "승 " + draw + "무 " + lose + "패 ";
	}
}
