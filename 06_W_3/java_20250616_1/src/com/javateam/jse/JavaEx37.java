package com.javateam.jse;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class JavaEx37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(System.currentTimeMillis());
		// System.out.println(new Date(System.currentTimeMillis()));
		
		// システム属性
		Properties props = System.getProperties();
		// props.forEach((k, v) -> System.out.println(k + "=" + v));
		System.out.println(props.getProperty("stdout.encoding"));
			// UTF-8
		
		// システム環境設定情報
		Map<String, String> map = System.getenv();
		map.forEach((k, v) -> System.out.println(k + "=" + v));
		
	}

}
