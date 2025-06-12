package com.javateam.jse;

public interface CalcInterface {
	// インターフェースの名前「CalcInterface」
		
	// インターフェースのメソッドは実装された「クラス」が提供すべきの「契約」を定義するメソッドである。
	// アクセス修飾子は基本的に「public」となっていて生成時に「package」したとしても「public」として機能する。
		
	// 四則演算の抽象メソッド
	// 抽象メソッド(Abstract Method)なのでメソッド本体は持たない。
	public int add(int num1, int num2);
	public int subtract(int num1, int num2);
	public int multiply(int num1, int num2);
	public int divide(int num1, int num2);
	public int remainder(int num1, int num2);
	/*
	 * もし、メソッド本体を持つとしたら、
	 * 
	 * @Override
	 * public int add(int num1, int num2) {
	 * return num1 + num2;			// この部分こそがメソッド本体が実装されるとのこと。
	 * }
	 * 
	 * のようになる。
	 */
}
