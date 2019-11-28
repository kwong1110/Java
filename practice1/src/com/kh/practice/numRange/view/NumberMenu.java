package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		System.out.print("����1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("����2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		try {
			System.out.print(num1 + "��(��)" + num2 + "�� ����ΰ� ? " + nc.checkDouble(num1, num2));
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
		
	}
}
