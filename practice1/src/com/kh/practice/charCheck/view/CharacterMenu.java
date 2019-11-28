package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		
		
		
		System.out.print("문자열 : ");
		String s = sc.nextLine();
		try {
			System.out.println("'"+ s +"'" + "에 포함된 영문자 개수 : " + cc.countAlpha(s));
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		
//		try {
//			cc.countAlpha(s);
//		} catch (CharCheckException e) {
//			e.printStackTrace();
//		}
	}
}
