package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;
//import com.kh.practice.charCheck.view.CharacterMenu;

public class CharacterController /*extends CharacterMenu*/{

	public CharacterController() {}
	
	public int countAlpha(String s) throws CharCheckException{
		
		int count = 0;
		
		// ���� ���ڸ� ã�� �ʿ� ���� 'a','A'�� �־� �θ��.
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i)) >= 'a' && (s.charAt(i)) <= 'z' 
					|| (s.charAt(i)) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
			} else if(s.charAt(i) == ' ') {
				throw new CharCheckException("üũ�� ���ڿ� �ȿ� ������ ���ԵǾ� �ֽ��ϴ�.");
			}
		}
		return count;
	}
}
