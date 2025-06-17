package com.javateam.jse;

// 可変式長さの変数

public class JavaEx25 {

	static void method(int ... nums) {
		// nt[] nums - com.javateam.jse.JavaEx25.method(int...)
	// static void method(int[] nums) {
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3};
		method(arr);
		method(1, 2, 3);
		// method(4, 5, 6);	
		// このように追加できる。
		// これが可変式ということ。
	}

}
