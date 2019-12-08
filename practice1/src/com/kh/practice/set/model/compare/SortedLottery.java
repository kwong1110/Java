package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// �̸� �������� -> ������ ��ȣ ��������.
		
		String standard = ((Lottery)o1).getName();
		String object = ((Lottery)o2).getName();
		
		String sPhone = ((Lottery)o1).getPhone();
		String oPhone = ((Lottery)o2).getPhone();
		
		int sorted = standard.compareTo(object);
		if(sorted == 0) {
			sorted = sPhone.compareTo(oPhone);
		}
		return sorted;
	}

}
