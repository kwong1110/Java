package com.kh.practice.list.music.model.vo;

public class Music implements Comparable {
	
	private String title;
	private String singer;
	
	public Music() {}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return singer + " - " + title;
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//	}
//	@Override
//	public int hashCode() {
//		return super.hashCode();
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Music other = (Music) obj;
		if (singer == null) {
			if (other.singer != null)
				return false;
		} else if (!singer.equals(other.singer))
			return false;
		
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		
		return true;
	}
	
	@Override
	public int compareTo(Object o) {
		
		// 가수명 내림차순 정렬.
		
		// compareTo :
		// 문자열의 사전순 값을 비교하여 그에 해당하는 int값을 리턴한다.
		String otherSinger = ((Music)o).getSinger();
		
		return -singer.compareTo(otherSinger);
	}
}
