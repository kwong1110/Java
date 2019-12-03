package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	public GalaxyNote9() {
		super.setMaker("�Ｚ");
	}	
	
	@Override
	public String charge() {
		return "�������, ��� ���� ����";
	}

	@Override
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}

	@Override
	public String takeCall() {
		return "��ȭ�ޱ� ��ư�� ����";
	}

	@Override
	public String picture() {
		return "1300�� ���ī�޶�";
	}

	@Override
	public String touch() {
		return "������, ������ ����";
	}

	@Override
	public boolean bluetoothPen() {
		return true;
	}

	@Override
	public String printInformation() {
		return "������ ��Ʈ9�� " + super.getMaker() + "���� ��������� ������ ������ ����.\n"
				+ makeCall() + "\n" + takeCall() + "\n" + picture() + "\n"
				+ charge() + "\n" + touch() + "\n" + "������� �� ž�� ���� : " + bluetoothPen() + "\n";
	}

}
