package com.javateam.jse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaEx34 {

	public static void main(String[] args) {

		String arr[] = { "오리", "죽전", "미금", "정자" };
		List<String> list = Arrays.asList(arr);
		
		Comparator<String> com = new Comparator<String>(){
			
			@Override
			public int compare(String o1, String o2) {
				// return o1.compareTo(o2); // 오름차순
				return o2.compareTo(o1); // 내림차순
			}
		};
		
		
		list.sort((o1, o2) -> o2.compareTo(o1));
		for (String s : list) {
			System.out.print(s + " ");
		}	// for
		
	}	//main

}	// class

