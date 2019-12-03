package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		pc.method();
		String[] srr = new String[2];
		for(int i = 0; i < srr.length; i++) {
			srr[i] = pc.method()[i];
			System.out.println(srr[i]);
		}
			
//		String[] srr = pc.method();
//		for(String s : srr) {
//			System.out.println();
//		}
		
	}
}
