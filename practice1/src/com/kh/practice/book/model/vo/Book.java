package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book implements Serializable {

	private String Title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
	
	public Book(){}

	public Book(String title, String author, int price, Calendar date, double discount) {
		this.Title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		long time = date.getTimeInMillis();
		Date endDay = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ");
		String fmt = sdf.format(endDay);
		return Title + " " + author + " " + price + " " + fmt + " " + discount;
	}	
}
