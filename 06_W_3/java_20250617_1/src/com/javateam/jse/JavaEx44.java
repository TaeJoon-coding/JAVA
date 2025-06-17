package com.javateam.jse;

import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaEx44 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List list;		//raw type => ジェネリックを使用しない場合。
		
		String []arr = { "java", "python", "html", "typescript" };
		// List<String> list = Arrays.asList(arr);			// 1)
		
		// List<String> list = new ArrayList<String>();	// (O)
		// List<> list = new ArrayList<>();			// (X)
		// List<> list = new ArrayList<String>();	// (X)
		List<String> list = new ArrayList<>();		// 2) 
		
		// 配列 => List変換(不変List) : カプセル化
		// 原型 : List<E> => List<String> : 要素（element）がstring
		
		// 配列の要素を一気に追加
		list.addAll(Arrays.asList(arr));
		// addAll引数
		// Collection<? extends String> <= List<String>
		// 自動的にアップスケーリング、공변성 : 다형성
		
		list.add("javascript");	// 1) (X) 不変list
		// エラー : Exception in thread "main" java.lang.UnsupportedOperationException
		// 2) (O)
		
		list.remove(0);	// 1) (X) 不変リストは削除したり、抜くのは不可能。 2) (O)
		list.set(0, "CSS");	// 1) 2) (O) しかし、変更は可能
		// System.out.println(list.get(0));	// リストの1番目の要素を出力。(検索)
		
		// 全体の羅列
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}
//		System.out.println();	// 改行
		
		// foreach loop : 内部的に 반복자パターン（iterator）を適用
//		for (String s: list) {
//			System.out.print(s + " ");
//		}
//		System.out.println();// 改行
		
		// foreachメソッド : 반복자パターン（iterator）を適用
//		list.forEach(e -> System.out.print(e + " "));
//			// 람다대수(기호식) : 矢印型プログラミング
//			// ECMAscript(ES)矢印関数と類似
//		System.out.println();
		
//		Consumer<String> con = new ConsumerImpl();
//		list.forEach(con);
//		System.out.println();
		
		// 関数型インターフェース : 具現したい抽象メソッドが一つである個人インターフェース
//		list.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t + " ");
//			}
//		});
		
		// list.forEach(t -> System.out.print(t + " "));
		
		// Iterator (リピーターパターン : 行為パターン)
//		Iterator<String> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
//		System.out.println();
		
		// 逆順羅列
		ListIterator<String> lit = list.listIterator(list.size());
		
		while (lit.hasPrevious()) {
			System.out.print(lit.previous() + " ");
		}
		
	}	// main

}	// class

class ConsumerImpl implements Consumer<String> {

	// Ctrl + 1 で自動生成
	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t + " ");
		
	}
	
}
