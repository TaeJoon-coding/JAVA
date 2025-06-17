package com.javateam.jse;
// 言うまでもなく、パッケージ名の宣言

public class CalcClass {
// クラスの宣言、
// パッケージ、クラスは最初に生成する時決めたままでよい。
	// public : アクセス修飾子、本クラスがJavaプログラムのどこからでもアクセス可能。
		// UMLダイアグラムの ● (public) に対応
	// class: これは CalcClass がクラス定義であることを示すキーワード
		// つまり、「public CalcClass」と書くな！とのこと。
	// CalcClass : 忘れがちだが、これが当クラスの名前。

/*
add(num1: int, num2: int): int (足し算)
subtract(num1: int, num2: int): int (引き算)
multiply(num1: int, num2: int): int (掛け算)
divide(num1: int, num2: int): int (割り算)
remainder(num1: int, num2: int): int (余り)
 */
	
	// メンバーフィールド（属性）は省略する。
	// 本課題では
	
	// public static void main(String[] args) 
		// 本課題では先ずいらないので削除
	// CalcClassが「状態を持たない（Stateless）」、いうと、外部からの入力（メソッドの引数）に基づいて計算を行う
	// その結果を返すだけのユーティリティクラス
	
		public int add(int num1, int num2) {
			// public : メソッドがクラスの外部から呼び出し可能であることを示す。
			// 誰でもこのメソッドを呼び出せるのでセキュリティー的には良くないが、便利。
			// int : int型の値を返す
			// add : このメソッドの名前、別に違う名前に変更してもいい。
			// (int num1, int num2) : num1とnum2という二つのint型の引数を「受け取る」
			return num1 + num2;
			// で、足し算。
		}

		public int subtract(int num1, int num2) {
			return num1 - num2;
			// 引き算
		}

		public int multiply(int num1, int num2) {
			return num1 * num2;
			// 掛け算
		}

		public int divide(int num1, int num2) {
			return num1 / num2;
			// 割り算
			// 要注意 : JAVAでは割り算の小数点以下は捨てられる。
			// 例 : 10 / 3 = 3
			// 0の対応も論外 : num1 / 0の場合、「java.lang.ArithmeticException」がスローされる。
			// そしてプログラムが異常終了される。
			// 
		}

		public int remainder(int num1, int num2) {
			return num1 %  num2;
			// 余りを返す
			// divideと同じく、num2が0の場合のチェックがない。
			// num1 % 0 のような操作が行われた場合、java.lang.ArithmeticException がスローされる。
		}
}
