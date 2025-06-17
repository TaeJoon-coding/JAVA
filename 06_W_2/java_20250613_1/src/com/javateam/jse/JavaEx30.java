package com.javateam.jse;

public class JavaEx30 {
	
	// 内部(inner, nested)クラス
	// インスタンスメンバークラス
	// 集合関係（has-A）
	class InnerClass {
		
		String name;
		
		InnerClass() {
			System.out.println("InnerClass コンストラクター");
		}
		
		void method() {}
		
	}	// InnerClass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InnerClass inner = new InnerClass();	// (X)
		JavaEx30 outer = new JavaEx30();
		
		JavaEx30.InnerClass inner 
			//	= new JavaEx30().new InnerClass();
			= outer.new InnerClass();
		inner.method();
	}	// main

}
