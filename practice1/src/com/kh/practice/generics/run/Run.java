package com.kh.practice.generics.run;

import com.kh.practice.generics.view.FarmMenu;

public class Run {

	public static void main(String[] args) {
		new FarmMenu().mainMenu();
	}
}

	// �ݼ�����
	// model.vo
	// 1. ��ӹ��� �ڽ� Ŭ�������� ����Ʈ ���� �� �־� �ٰ�.
	// -> toString() : super.kind �߰�.

	// view
	// 2. ������ ���� �� �ִ��� �ѹ��� Ȯ�� �ϱ�.
	// -> boolean ���� ��� ������ println ���ִ� ���� ���� �� �ִ�.

	// 3. Iterator ���� next()�� ������ ��� �������
	// -> �ܹ����̹Ƿ� ������ ��� ����ؾ� �ϳ��� ���� ���� ��µ�.
