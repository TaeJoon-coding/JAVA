package com.javateam.jse;

public class JavaEx2 {
	public static void main(String[] args) {
		
		// byte num1 = 1;
		//変数の宣言（declare, define） + 割り当て（代入 ： assign）
		byte num1;	//宣言
		num1 = 27;	//代入（割り当て）
		System.out.println(num1);
		num1 = 36;	//更新
		System.out.println(num1);
		// num1 = "a";	
		// (X)エラー、「byte」では読み込めない。
		//　num1 = 128;	
		// (X)エラー、「byte」の範囲外、修正すると、shortでなく、intになる。
		// 整数基本データ型 => int
		num1 = (byte)128;	//型変換（casting）
		System.out.println("num1 : " + num1);
		// オーバーフロー、(byte)128=>-128
		num1 = 'a';	//97 ASCIIコードによるもの
		num1 = '0';	//48 ASCIIコードによるもの
		num1 = 0x0a;	//10 16進数から変換
		num1 = 011;		//9 8進数から変換
		num1 = 0b111;	//7 2進数から変換
		
		// num1 = "11";	//(X)
		// num1 = (byte)"11";	(X)
		// num1 = Byte.parseByte("11");
		// byte : 基本データ型
		// Byte : byte基本データ型のwrapper
		// クラス（参照データ型）
		// 型変換（casting）関数（メソッド）
		
	}

}
