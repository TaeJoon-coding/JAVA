package com.javateam.jse;

import java.util.regex.Pattern;

public class JavaEx43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 電話番号
		boolean result =
		Pattern.compile("090-\\d{4}-\\d{4}")
			   .matcher("090-1234-1234")
			   .matches();
		// System.out.println("result : " + result);
		// if (result = true) {
		if (result == true) {
			// resultがtrueと等しいか比較する
			System.out.println("result : 正しいです。");
		} else {
			System.out.println("result : 正しくありません");
		}
	}

}
