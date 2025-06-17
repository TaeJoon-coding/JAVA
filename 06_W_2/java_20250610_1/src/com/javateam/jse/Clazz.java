package com.javateam.jse;

public class Clazz {
	
	// メンバー変数（フィールド : field）
	// 묵시적 초기값 가짐
	String name; // has-A : aggregation関係
	
	// (基本コンストラクター)
	// 
	Clazz() {
		System.out.println("基本コンストラクター");
	}
	
	void method(String name) {
		this.name = name;	// メンバーフィールド <== 인자
		System.out.println("インスタンスメソッド : " + this.name);
	}
	
	void method(String name, int age) {
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// インスタンス（オブジェクト変数生成過程）
		// Clazz : 参照データ型（クラス）
		// clazz : 地域変数
		// new : オブジェクト（インスタンス）生成オペレーター
		// Clazz() : constructor コンストラクター
		// クラスと同一な名称のメソッド（関数）
		// インスタンス初期化
		// 
		// 
		// 
		// 
		// 
		// clazzと言う名の
		
		// Clazz clazz = new Clazz();
		Clazz clazz;
		clazz = new Clazz();
		System.out.println(clazz.name);	// null
	}

}
