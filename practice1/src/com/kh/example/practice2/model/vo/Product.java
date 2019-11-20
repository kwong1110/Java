package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		pName = "ġŲ";
		price = 18000;
		brand = "bbq";			
	}
	
	public void information() {
		System.out.println(pName + price + brand);
	}
}
