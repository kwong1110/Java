package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book bk = new Book("하이하이", "인사출판사", "김광림");
		bk.inform();
		
		Book bk2 = new Book("하이하이", "인사출판사", "김광림", 10000, 0.3);
		bk2.inform();
	}
}
