package com.javateam.jse;

public class JavaEx38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java";
		str += " python";
		System.out.println("str : " + str);
		
		StringBuilder st = new StringBuilder();
		// st.append("java");
		// st.append(" python");
		st.append("java")
		  .append(" python");
		System.out.println("str : " + st);
		
	}

}
