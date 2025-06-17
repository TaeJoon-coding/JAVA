package com.javateam.jse;

public class JavaEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr2[][];	// 2D(dimension : 次元)
		// arr2 = new int[3][2];	// 行列（matrix : row(行) * column(列)）

		// int [][] arr2;
		// int []arr2[];
		// int arr2[3][2];		// (X)
		
		int arr2[][] = { {1,2}, 
						 {3,4}, 
						 {5,6} };
		
		System.out.println("配列の初要素 : " + arr2[0][0]);
		// 0
		System.out.println("配列の大きさ（長さ）: " + arr2.length);	
		// 3 = 行(row)数
		
		int arrSize = arr2.length * arr2[0].length;
		System.out.println("配列の実際の요소数 : " + arrSize);
		// 6 = 行 * 列 数
		
		// 全体の羅列
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				System.out.print(arr2[i][j] + " ");
//			}	//for j
//			System.out.println();
//		}	// for i
		
		// foreach loop(関数でない문구) : 次の要素を検索する方式(iterator)
		for (int []arr1 : arr2) {
			for (int n : arr1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
