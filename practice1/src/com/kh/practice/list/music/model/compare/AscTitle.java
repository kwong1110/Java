package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		// ���� �������� ����.
		
		String standard = ((Music)o1).getTitle();
		String object = ((Music)o2).getTitle();
		
		String sSinger = ((Music)o1).getSinger();
		String oSinger = ((Music)o2).getSinger();
				
		// ������ ������ �ҷ����� compartTo�޼ҵ带 �̿� ��Ʈ������ ��ȯ.
		// Ÿ��Ʋ�� ������ ���������� ���������� �������־�� �ϹǷ�,
		// int ������ ��� �� 0�϶� ������ ���������� ������ �ǰԲ� ��.
		
		int ascTitle = (standard.compareTo(object));
		if(ascTitle == 0) {
			ascTitle = sSinger.compareTo(oSinger);	
		}
		return ascTitle;
	}
}
