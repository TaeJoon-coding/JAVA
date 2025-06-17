package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaEx45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("松山");
		list.add("高松");
		list.add("別府");
		list.addAll(Arrays.asList("富士", "石手", "相模原", "稲葉", "烏丸"));
		list.add("別府");	// 重複要素挿入
		
		
		System.out.println("list size : " + list.size());		// 9
		
		System.out.println("含まれたのか : " + list.contains("別府"));		// true
		
		boolean result = list.containsAll(Arrays.asList(new String[] {"別府", "松山"}));		// true
		// boolean result = list.containsAll(Arrays.asList(new String[] {"別府", "大野"}));		// false
		
		System.out.println("多数の要素、含まれたのか : " + result);
		
		
		// リストから要素を除去
		// list.removeAll(Arrays.asList(new String[] {"別府", "大野"}));
		// 「別府」が除去された。「大野」は元々存在しないから除去されたりはしない。
		
//		list.addFirst("石手");
//		list.addLast("高松");
		
		// list.clear(); 		// すべての要素を削除
		System.out.println("リストが空白か : " + list.isEmpty());
		
		// list.subList(0, 5).forEach(System.out::println);
		// 一部分リストを抽出 => 羅列
		// index "5" : 排除(exclusive) => index 0 ~ 4
		
		list.replaceAll(x -> x.replace("相模原", "埼玉"));
		// 要素を変更
		
		// list.retainAll(Arrays.asList("高松", "渋谷", "相模原"));
		// 共通要素だけを抽出
		
		list.stream()
			.sorted()	// 오름차순
			.limit(3)	// 上位三つだけを抽出
			.forEach(System.out::println);	// 出力
		
		list.forEach(x -> System.out.print(x + " "));
		
	}

	// Function : return値が必要
	// predicate : return値が必須ではない。
}
