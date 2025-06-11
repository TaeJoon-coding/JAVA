package com.javateam.jse;

// public class JavaEx24 extends Object {
public class JavaEx24 {
	
	String name;
	int age;

	JavaEx24() {
		System.out.println("基本コンストラクター");
	}
	/**
	 * @param name
	 * @param age
	 */
	// public JavaEx24(String name, int age) {
		// ほかの所から「name」をCtrl + クリックすると、ここの「name」に来る。
	
	public JavaEx24(String name2, int age) {	
	
		super();	//親クラス(Object)の基本コンストラクター
		
		// 変数 : (地域・メンバー)同名の変数がある場合、地域変数が優先される。
		// String name = "";
		// メンバーフィールドの初期化
		
		// name = name;	
		// The assignment to variable name has no effect
		// 인자に인자を代入するようなもの。
		
		// this.name = name; 
		// メンバーフィールド <= 인자(媒介変数)
		this.age = age;
	}
	
	
//	void JavaEx24() {
//		System.out.println("基本コンストラクター");
//	}
	// コンストラクターに見えるが、コンストラクターではない。
	// インスタンスメソッドだ。
	// これだけでは何も出ない。
	
//	JavaEx24 JavaEx24() {
//		System.out.println("基本コンストラクター");
//	}
	// これもコンストラクターにはならない。
	// 文法的に間違っている。

	void method(String name) {
		System.out.println("name = " + name);
	}
	
	void method2() {
		//this.method("Java");
		method("Java");	// メソッドがほかのメソッドを呼び出す。
	}
	
	static void method3() {
		// this.method("Java");
		// インスタンスメソッドを呼び出した時 => staticのばあい、インスタンス生成に接近
		JavaEx24 obj = new JavaEx24();
		obj.method("Java");	// メソッドがほかのメソッドを呼び出す。
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEx24 obj = new JavaEx24();
		obj.method("Java");
//		obj.JavaEx24();
//		obj.name =  "HTML";
//		System.out.println(obj.name);
//		
//		// JavaEx24 obj = new JavaEx24("Java", 30);
//		obj = new JavaEx24("Java", 30);
//		System.out.println(obj.name);
	}

}
