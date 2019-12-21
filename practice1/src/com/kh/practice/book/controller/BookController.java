package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.vo.Book;
import com.kh.practice.book.model.vo.BookDAO;

public class BookController {

	private BookDAO bd = new BookDAO();
	
	public void makeFile() {
		try {
			new File("book.txt").createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}
	
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
