package com.javateam.jse;

public class CalcUse {
	// 「CalcInterfaceImpl」を活用する新しいクラス「CalcUse」
	// 「public」はどこからでもアクセス可能であることを示す。
	
	// CalcClass calcClass = new CalcClass();
	CalcInterface calcClass = new CalcInterfaceImpl();
	// メンバーフィールドの型を変更し、初期化(CalcInterfaceImpl)
	// 型はインターフェースではあるが、インスタンス化するのは「*具象クラス (CalcInterfaceImpl) 」
	// よって、「CalcUse」は具体的な実装クラスに直接依存せず、インターフェースを介して「*疎結合（loose coupling)」になる
	
	
	
	public int calc(String operator, int num1, int num2) {
		// public : このメソッドを外部から呼び出せる。
		// int : このメソッドがint型で値を返すことを示す。
		// calc : このメソッドの名前
		// (String operator, int num1, int num2) : メソッドが受け取る引数三つを定義。
			// operator : 実行するオペレーター(演算子、+や-など)を文字列として受け取る。
			// num1, num2 : 演算する数字
		// 本課題において、ここは一旦修正の必要はない。
		// 「calcClassフィールド」は型が「CalcInterface」になっても「CalcInterface」で
		// 定義されたメソッド(add、subtractなど)を呼び出すことが可能。
		int result = 0;
		// 計算結果の臨時格納庫、0で初期化
		
		switch (operator) {
		// operatorの文字列の値ごと別の処理を行うための「制御装置」
		
		case "+" : result = calcClass.add(num1, num2); break;
		// operatorが+の場合、「calcInterfaceImpl」インスタンス(CalcClassオブジェクト)の「add」メソッドを「num1, num2」を引数にして
		// 呼び出して、その結果の値を「result」に格納する。
		// break : このcaseの処理を終えたらswitch文を抜ける
		case "-" : result = calcClass.subtract(num1, num2); break;
		case "*" : result = calcClass.multiply(num1, num2); break;
		case "/" : result = calcClass.divide(num1, num2); break;
		case "%" : result = calcClass.remainder(num1, num2); break;
		default : result = calcClass.add(num1, num2); break;
		// 以上のどの「case」にも該当しない場合、実行される。
		// 本課題はデフォルトで加算 (calcInterfaceImpl.add) が行われるように指定されてる。
		// ので、「case "+" 」と同じく、「add」メソッドを呼び出す。
		} //
		
		return result;
		// で、この「calc」メソッドで算出された「result」を値として呼び出して元に返す。
	}
	
	public static void main(String[] args) {
		// 特集なメソッド
		// Javaアプリケーションの「エントリーポイント」となる。
		// 本クラスが直接実行された時、このメソッドから処理される。

		// 変更するところはない。
		
		CalcUse calcUse = new CalcUse();
		// 「CalcUse」クラスの新しいインスタンスを作成。
		// 「calc」メソッドはインスタンスメソッドであるため、呼び出すためには先に「CalcUse」オブジェクトの作成が必要。
		
		System.out.println("足し算の値 : "+ calcUse.calc("+", 1, 2));
		System.out.println("引き算の結果 : " + calcUse.calc("-", 2, 1));
		System.out.println("掛け算の結果 : " + calcUse.calc("*", 2, 3));
		System.out.println("割り算の結果 : " + calcUse.calc("/", 4, 2));
		System.out.println("余り演算の結果 : " + calcUse.calc("%", 3, 2));
		// 全部、四則演算の出力テスト、後で「scanner」などを利用してみるのも有りかも。
		
	}

}