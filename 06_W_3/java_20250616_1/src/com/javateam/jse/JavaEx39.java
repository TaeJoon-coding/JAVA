package com.javateam.jse;

import java.util.StringTokenizer;

public class JavaEx39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "6月16日は月曜日です。";
			   str = str.concat("6月17日は火曜日です。");
		StringTokenizer st = new StringTokenizer(str, "。");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
