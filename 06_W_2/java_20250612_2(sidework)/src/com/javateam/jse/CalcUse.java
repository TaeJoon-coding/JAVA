package com.javateam.jse;

public class CalcUse {
	// 「CalcInterfaceImpl」を活用する新しいクラス「CalcUse」
	// 「public」はどこからでもアクセス可能であることを示す。
	
	CalcInterfaceImpl calcInterfaceImpl = new CalcInterfaceImpl();
	// CalcClassのインスタンスを生成し、このフィールドに代入して初期化する。
	// デフォルトアクセス修飾子（無表記）。
	// メンバーフィールドの定義と初期化をこの一行で行う。
	// ▲ (default アクセス修飾子)に対応、無表記。
	
	// よく分からないが、geminiが追加したコメント
	/**
     * 指定された演算子と数値を用いて計算を実行します。
     * @param operator 演算子を示す文字列 (+, -, *, /, %)
     * @param num1 1番目の被演算数
     * @param num2 2番目の被演算数
     * @return 計算結果 (int型)
     */
	
	public int calc(String operator, int num1, int num2) {
		// public : このメソッドを外部から呼び出せる。
		// int : このメソッドがint型で値を返すことを示す。
		// calc : このメソッドの名前
		// (String operator, int num1, int num2) : メソッドが受け取る引数三つを定義。
			// operator : 実行するオペレーター(演算子、+や-など)を文字列として受け取る。
			// num1, num2 : 演算する数字
		
		int result = 0;
		// 計算結果の臨時格納庫、0で初期化
		
		switch (operator) {
		// operatorの文字列の値ごと別の処理を行うための「制御装置」
		
		case "+" : result = calcInterfaceImpl.add(num1, num2); break;
		// operatorが+の場合、「calcInterfaceImpl」インスタンス(CalcClassオブジェクト)の「add」メソッドを「num1, num2」を引数にして
		// 呼び出して、その結果の値を「result」に格納する。
		// break : このcaseの処理を終えたらswitch文を抜ける
		case "-" : result = calcInterfaceImpl.subtract(num1, num2); break;
		case "*" : result = calcInterfaceImpl.multiply(num1, num2); break;
		case "/" : result = calcInterfaceImpl.divide(num1, num2); break;
		case "%" : result = calcInterfaceImpl.remainder(num1, num2); break;
		default : result = calcInterfaceImpl.add(num1, num2); break;
		// 以上のどの「case」にも該当しない場合、実行される。
		// 本課題はデフォルトで加算 (calcInterfaceImpl.add) が行われるように指定されてる。
		// ので、「case "+" 」と同じく、「add」メソッドを呼び出す。
		} //
		
		return result;
		// で、この「calc」メソッドで算出された「result」を値として呼び出して元に返す。
	}
	
	// よく分からないが、geminiが追加したコメント
	/**
     * プログラムのエントリポイント。
     * CalcUse クラスの calc メソッドの動作をテストします。
     * @param args コマンドライン引数 (使用しない)
     */
	
	public static void main(String[] args) {
		// 特集なメソッド
		// Javaアプリケーションの「エントリーポイント」となる。
		// 本クラスが直接実行された時、このメソッドから処理される。

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