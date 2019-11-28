package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {

	public NumberController() {
		
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		boolean bool = true;
		if(num1 <= 100 && num1 >= 1 && num2 <= 100 && num2 >= 1) {
			if(num1 % num2 != 0) {
				bool = false;
			}
		} else {
			throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
		}
		return bool;
	}
}
