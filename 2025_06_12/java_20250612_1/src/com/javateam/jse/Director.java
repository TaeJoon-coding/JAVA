package com.javateam.jse;

public interface Director {

	// int num;	// (X)
	// インターフェースは基本的には一般メンバーフィールドを出来ない。
	
	int num = 1;	// (O)
	// これのオリジナルは
	// public static final int num = 1;	// (O)
	
	// private static final int num = 1;	//(X)
	// インターフェースでは「private」などなどは出来ない。
	// static final int num = 1;	// (O)
	// default 접근제어자 ではなく、public
	// protected private static final int num = 1;	// (X)
	// 「private」がダメなのと同じく、だめ！
	
	// コンストラクター
	// A a = new A();
	// public Director() {}
	// インターフェースはコンストラクターを持たない。
	// インターフェースはこのように実際稼働されるところを持たない。
	
	// Java8以前のインターフェース : 추상(지시)メソッド死か存在しなかった！
	// void method() {	}
	
	// Java8以後
	// private void privateMethod() { }	// (O) 実のことを言うと、良くない。
	// このような物が可能になった。
	// static void privateMethod() { 
	static void staticMethod() {	// 黙示的にpublic
		// protected static void privateMethod() { 	// (X)
		// private static void privateMethod() { 	// (O)
		System.out.println("インターフェースの静的メソッド");
	}
	
	default void defaultMethod() {
		System.out.println("defaultメソッド");
	}
	
	// 추상メソッド
	// abstract void order();
	void order();
	
	public static void main(String[] args) {
		System.out.println("インターフェースの実行");
		// Director director = new Director();	// (X)
		staticMethod();
	}


}