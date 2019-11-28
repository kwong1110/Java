package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapControll;

public class LeapView {
	
	public LeapView() {
		Calendar c = Calendar.getInstance();
		LeapControll lc = new LeapControll();
		String year = "";
		if(lc.isLeapYear(c.get(Calendar.YEAR))) {
			year = "����";
		} else {
			year = "���";
		}
		System.out.println(c.get(Calendar.YEAR) + "���� " + year + "�Դϴ�.");
		System.out.println("�� ��¥ �� : " + lc.leapDate(c)); // 737391
	}
}
