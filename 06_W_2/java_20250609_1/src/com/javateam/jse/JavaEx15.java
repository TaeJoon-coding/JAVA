package com.javateam.jse;

public class JavaEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop:
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 10; i++) {
				// System.out.print(i + " ");
				if (i % 2 == 1) {
					// continue; 	//Skip once
					break loop;
				}	// if
				System.out.println(i + " ");
			}	// for i
			System.out.println(" J : " + j);
			
		}	// for j
		
		System.out.println("終わり");
	}

}
