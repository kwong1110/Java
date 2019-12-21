package com.kh.practice.book.model.vo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookDAO {

	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));) {
			if(bArr != null) {
				for(int i = 0; i < bArr.length; i++) {
						oos.writeObject(bArr[i]);
						this.bArr[i] = bArr[i];
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Book[] fileRead() {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("book.txt"));

//			Book[] bArr = new Book[10];
			
//			try {
				for(int i = 0; i < bArr.length; i++) {
					bArr[i] = (Book)ois.readObject();
				}
//			} catch (EOFException e) {
//				ois.close();
//			}
		} catch (EOFException e) {
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return bArr;
	}
}
