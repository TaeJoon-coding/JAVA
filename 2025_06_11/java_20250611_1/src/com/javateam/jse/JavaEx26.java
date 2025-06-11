package com.javateam.jse;
//문제를 위해 있음:
//정적 블록

// import java.lang.*;
// 基本パッケージ、importしなくても、基本的に含まれている。

public class JavaEx26 {
	
	void method() {
		System.out.println("メソッド");
	}

	static {
		System.out.println("정적 블록-1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		new JavaEx26().method();
	}
	
	static {
		System.out.println("정적블록-2");
	}
	{
		System.out.println("インスタンス블록 : インスタンス生成時実行");
	}

}
