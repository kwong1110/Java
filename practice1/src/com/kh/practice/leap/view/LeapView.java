package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapControll;

public class LeapView {
	
	public LeapView() {
		Calendar c = Calendar.getInstance();
		LeapControll lc = new LeapControll();
		String year = "";
		if(lc.isLeapYear(c.get(Calendar.YEAR))) {
			year = "윤년";
		} else {
			year = "평년";
		}
		System.out.println(c.get(Calendar.YEAR) + "년은 " + year + "입니다.");
		System.out.println("총 날짜 수 : " + lc.leapDate(c)); // 737391
	}
}
