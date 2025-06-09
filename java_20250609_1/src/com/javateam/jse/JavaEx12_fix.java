package com.javateam.jse;

import java.util.Scanner;
//0O 1Il	한글
public class JavaEx12_fix {

	public static void main(String[] args) {
		System.out.print("入力 : ");

		// try-with-resources を使用して Scanner を自動的に閉じる
		try (Scanner sc = new Scanner(System.in)) {
			// Scanner sc = new Scanner(System.in)をtry-with-resources ステートメント内に移動。
			// 「try」ブロックが修了すると「sc」オブジェクトのclose() メソッドを自動的に呼び出す。
			// 例外が発生しても、「sc」は閉じられる。
			int limit = sc.nextInt();
			int sum = 0;
			int i = 1;

			for (;;) {
				if (i <= limit) {
					sum += i++;
				} else {
					break;
				}
			}
			System.out.printf("1 ~ %dまでの合計 = %d%n", limit, sum);
		} // tryブロックを抜ける際にscが自動的に閉じられる
	}
}