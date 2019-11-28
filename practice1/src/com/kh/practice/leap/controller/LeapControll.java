package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapControll {
	
	public boolean isLeapYear(int year) {
		if((year % 4 == 0 && (year % 100 != 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public long leapDate(Calendar c) {

		long leapDate = 0;
		
		for(int i = 1; i < c.get(Calendar.YEAR); i++) {
			
			// i가 true 일때이므로  i값을 넣어줘야함
			// if(isLeapYear(c.get(Calendar.YEAR)) {  그럼  2019일때만 적용됨.
			if(isLeapYear(i)) {  
				leapDate += 366;
			} else {
				leapDate += 365;
			}
		}
		
		for(int i = 0; i < 12; i++) {
			if(c.get(Calendar.MONTH) == i) {
				break;
			}
			switch(i) {
			case 0: case 2: case 4: case 6: case 7: case 9: case 11: leapDate += 31; break;
			case 3: case 5: case 8: case 10: leapDate += 30; break;
			case 1: if(isLeapYear(c.get(Calendar.YEAR))) {
						leapDate += 29; break;
					} else {
						leapDate += 28; break;
					}
			}
		}
		
		leapDate += c.get(Calendar.DATE);
		return leapDate;
	}
	
}
