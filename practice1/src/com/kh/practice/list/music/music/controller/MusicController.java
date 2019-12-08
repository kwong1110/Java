package com.kh.practice.list.music.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		// 만약 추가되면 마지막에 추가되는 것이니까, 
		// 랭스-1 index가 music과 일치하다면 1, 그렇지않다면 0으로 해야 더 맞는거같은데... 
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public int printAll() {
		System.out.println(list.subList(0, list.size()));
		return 1;
	}
	
	public Music searchMusic(String title) {
		// 처음 값을 null로 해주어야 검색이 안됨.
		Music searchMusic = new Music();
		searchMusic = null;
		for(int i = 0; i < list.size(); i++) {
//			if(list.contains(new Music(title, list.get(i).getSinger()))) {
			if(list.get(i).getTitle().equals(title)){
				searchMusic = list.get(i);
				break;
			}
		}
		// 만약 동일 곡이 여러개라면...?? 
		// 문제에 안써있으니 우선 이렇게 함.
		return searchMusic;
	}
		
	
	public Music removeMusic(String title) {
		// remove(int index) -> 반환 : E
		// remove(Object o) -> 반환 : boolean
		
		Music removeMusic = new Music();
		removeMusic = null;
		for(int i = 0; i < list.size(); i++) {
//			if(list.contains(new Music(title, list.get(i).getSinger()))) {
				
			if(list.get(i).getTitle().equals(title)){
				removeMusic = list.remove(i);
//				removeMusic = list.get(i);
//				list.remove(list.get(i));
				break;
			}
		}
		return removeMusic;
	}
	
	public Music setMusic(String title, Music music) {
		// 타이틀과 일치하면 그 객체를 m에 넣어 리턴 후 set()으로 바꿔줌.
		Music m = new Music();
		m = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				m = list.get(i);
				list.set(i, music);
				break;
			}
		}
		return m;
	}
	
	public int ascTitle() {	
		list.sort(new AscTitle());  // 제목 같으면 가수 오름차순 정렬. comparator클래스이용.
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(list); // 가수 내림차순 정렬. compareTo 메소드 이용.
		return 1;
	}
	
}
