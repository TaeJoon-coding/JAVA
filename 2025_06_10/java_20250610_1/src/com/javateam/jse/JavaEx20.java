package com.javateam.jse;

public class JavaEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int arr2[] = new int[5];
		
		arr2 = arr;	// 浅いコピー(shallow copy)
		// arr2[0] = arr.clone();	// 深いコピー(deep copy)
		// System.arraycopy(arr, 0, arr2, 0, arr.length);	// 深いコピー(deep copy)
		// arr2 = Arrays.copyOf(arr, arr.length);	// 深いコピー(deep copy)
		
		
		arr2[0] = 30;
		// 配列の浅いコピー(shallow copy)
		// 요소変更 => オリジナル・コピーを同時に変更
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr[0] : " + arr[0]);
		
	}

}
