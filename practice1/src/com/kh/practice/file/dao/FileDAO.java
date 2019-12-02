package com.kh.practice.file.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		//  �����ϴ� ������ �ִ��� Ȯ�� �� ��ȯ.
		
		File f = new File(file);
		f.exists(); 
		return f.exists();
		// ���� ������ boolean ������ ��ȯ�ϴ� �޼ҵ� .exists();
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
		// �Ű� ������ ���� ���� �� ���ڿ� ����.
		
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
				sb.append((char)value);  // **��ü�� �޼ҵ带 �̿��Ͽ� �־����.
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
