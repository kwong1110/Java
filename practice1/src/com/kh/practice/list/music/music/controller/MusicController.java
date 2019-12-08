package com.kh.practice.list.music.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		// ���� �߰��Ǹ� �������� �߰��Ǵ� ���̴ϱ�, 
		// ����-1 index�� music�� ��ġ�ϴٸ� 1, �׷����ʴٸ� 0���� �ؾ� �� �´°Ű�����... 
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
		// ó�� ���� null�� ���־�� �˻��� �ȵ�.
		Music searchMusic = new Music();
		searchMusic = null;
		for(int i = 0; i < list.size(); i++) {
//			if(list.contains(new Music(title, list.get(i).getSinger()))) {
			if(list.get(i).getTitle().equals(title)){
				searchMusic = list.get(i);
				break;
			}
		}
		// ���� ���� ���� ���������...?? 
		// ������ �Ƚ������� �켱 �̷��� ��.
		return searchMusic;
	}
		
	
	public Music removeMusic(String title) {
		// remove(int index) -> ��ȯ : E
		// remove(Object o) -> ��ȯ : boolean
		
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
		// Ÿ��Ʋ�� ��ġ�ϸ� �� ��ü�� m�� �־� ���� �� set()���� �ٲ���.
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
		list.sort(new AscTitle());  // ���� ������ ���� �������� ����. comparatorŬ�����̿�.
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(list); // ���� �������� ����. compareTo �޼ҵ� �̿�.
		return 1;
	}
	
}
