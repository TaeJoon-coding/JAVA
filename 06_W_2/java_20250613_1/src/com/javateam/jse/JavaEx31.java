package com.javateam.jse;

// public static class JavaEx31 {		//	(X)
public class JavaEx31 {
	
	static class StaticClass {
		//	ここで作成したのは先ず呼び出さないと出力されない。
		String name;
		
		StaticClass() {
			System.out.println("静的クラスのコンストラクター");
		}
		
		void method() {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass st = new StaticClass();	// (O)
		// JavaEx31.StaticClass st = new StaticClass();	// (O)
		// JavaEx31.StaticClass st = new JavaEx31().new StaticClass();	// (X)
		st.method();
		// 
	}

}
