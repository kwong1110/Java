package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		// 제목 오름차순 정렬.
		
//		String standard = ((Music)o1).getTitle();
//		String object = ((Music)o2).getTitle();
		
		String sSinger = ((Music)o1).getSinger();
		String oSinger = ((Music)o2).getSinger();
		
		// 사전상 순서를 불러오는 compartTo메소드를 이용 인트형으로 반환.
		int ascTitle = ((Music)o1).getTitle().compareTo(((Music)o2).getTitle());
//		if(ascTitle == 0) {
//			return sSinger.compareTo(oSinger);	
//		} else {
			return ascTitle;
//		}
	}
}
