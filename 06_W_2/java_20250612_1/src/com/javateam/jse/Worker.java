package com.javateam.jse;

public class Worker implements Director {
// Director : 親（上司）
// Worker : 子（部下）
	
	// 選択的オーバーローディング => 융통성
	@Override
	public void defaultMethod() {
		Director.super.defaultMethod();
		// インターフェースのdefaultメソッド
		// System.out.println("上司の仕事をオーバーライディングする")
	}

	@Override	// an-notation
	// オーバーローディング明示・監督！
	// 設定(configuration)情報 : XML, text(~~.cfg...) => 縮小 
	public void order() {
		System.out.println("Director指示通り働く");
	}

	public void workerMethod() {
		System.out.println("社員のメソッド");
	}
}
