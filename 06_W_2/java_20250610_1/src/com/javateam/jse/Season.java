package com.javateam.jse;

// enumeration => enum 列挙型 : 상수들의 모음
public enum Season {
	// classでの상수 => 
	//	public static final String Spring = "Spring"
	Spring("春"),
	Summer("夏"),
	Fall("秋"),
	Winter("冬");
	
	
	private String season;
	// private(クラス内部だけで適用される) => セキュリティー
	// access modifier
	
	private Season(String season) {
		this.season = season;
	}
	public String getSeason() {
		return season;
	}
}
