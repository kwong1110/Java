package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		
		
		
		System.out.print("���ڿ� : ");
		String s = sc.nextLine();
		try {
			System.out.println("'"+ s +"'" + "�� ���Ե� ������ ���� : " + cc.countAlpha(s));
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
