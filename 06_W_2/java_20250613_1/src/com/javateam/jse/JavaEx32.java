package com.javateam.jse;

public class JavaEx32 {
	
	void localMethod() {
		class LocalClass {
			String name;
			LocalClass() {
				System.out.println("LocalClass コンストラクター");
			}
			void method() {
			}
		}
		LocalClass local = new LocalClass();
		local.method();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
