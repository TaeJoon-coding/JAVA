package com.javateam.jse;

public class Worker2 extends AbstractClass {

	public Worker2() {
		// super();
		System.out.println("社員のコンストラクター");
	}
	
	@Override
	void abstractMethod() {
		System.out.println("課長の指示にしたがって働く");
	}
	
	public static void main(String[]  args) {
		// AbstractClass work = new AbstractClass(); // (X)
				AbstractClass work = new Worker2(); // (O)
				work.abstractMethod();
	}
	

}
