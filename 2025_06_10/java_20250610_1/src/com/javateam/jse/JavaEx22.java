package com.javateam.jse;

public class JavaEx22 {
	// 「static」はメンバーフィールド（変数）で
	static final float PI = 3.141592F;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final float PI = 3.141592F;
		// これが상수化
		// static final PI = 3.141592F;	// static => 地域変数では使用しない。
		
		System.out.println(PI);
		
		// PI = 3.14f; //(X) javascriptの「const」に当たる。
		// javaにも「const」はまだあるが、死語になった。
	}

}
