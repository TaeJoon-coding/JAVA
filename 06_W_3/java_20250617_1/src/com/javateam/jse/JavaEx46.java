package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaEx46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("松山");
		list.add("高松");
		list.add("別府");
		list.addAll(Arrays.asList("富士", "石手", "相模原", "稲葉", "烏丸"));
		list.add("別府");	// 重複要素挿入
		
		Collections.sort(list);	// sorting, ordering
		// 오름차순 정령(ascending sort)
		// 基準 : コード順(ex. UTF-8)
		
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				// return 01.compareTo(o2);
//				return o2.compareTo(o1);
//			}
//			
//		});
		// Collections.sort(list, Comparator.reverseOrder());	// 
		// Collections.sort(list, Comparator.naturalseOrder());	// 
		// Collections.sort(list, (o1, o2) -> o2.compareTo(o1));	// 내림차순
		// λ（ラムダ）短縮
		
		// list.sort(Comparator.reverseOrder());
		
//		Collections.shuffle(list);
//		
//		list.forEach(x -> System.out.print(x + " "));
		
		// Listから配列に置換
		String []arr = new String[list.size()];
		arr = list.toArray(arr);
		System.out.println("arr[3] : " + arr[3]);
		
		list.addAll(Arrays.asList(new String[] {"鷹子町", "麒麟町", "新宿"}));
		
		
		list.stream()
			.filter(x -> x.contains("町"))
			.sorted()
			.forEach(System.out::println);
		// 「町」という検索語が含まれた(contains)
		// 地名を抽出して
			
		
	}

	// Function : return値が必要
	// predicate : return値が必須ではない。
}
