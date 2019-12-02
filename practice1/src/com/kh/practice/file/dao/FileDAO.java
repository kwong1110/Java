package com.kh.practice.file.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		//  존재하는 파일이 있는지 확인 후 반환.
		
		File f = new File(file);
		f.exists(); 
		return f.exists();
		// 존재 유무를 boolean 값으로 반환하는 메소드 .exists();
		// File f = new File(file);
		
//		boolean check = true;
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			check = false;
//		}
//		return check;
	}
	
	public void fileSave(String file, String s) {
		// 매개 변수로 받은 파일 명에 문자열 저장.
		
		try(FileWriter fw = new FileWriter(file)) {
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(FileReader fr = new FileReader(file)) {
			
			int value;
			while((value = fr.read()) != -1) {
				sb.append((char)value);  // **객체라서 메소드를 이용하여 넣어야함.
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb;
	}
	
	public void fileEdit(String file, String s) {
//		try(FileOutputStream fos = new FileOutputStream(file, true)) {
//			fos.write(s);
		try(FileWriter fw = new FileWriter(file)) {
			fw.write(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
