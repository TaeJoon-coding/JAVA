// CalcInterfaceImpl.java (旧 CalcClass.java)
// ので、「CalcClass」というテキストが多量に残っている可能性もある。
package com.javateam.jse;
// 言うまでもなく、パッケージ名の宣言

public class CalcInterfaceImpl implements CalcInterface {
// 継承（Inheritance）とインターフェースの実装(Implementation)
	// public : アクセス修飾子、本クラスがJavaプログラムのどこからでもアクセス可能。
		// UMLダイアグラムの ● (public) に対応
	
	// class: これは CalcInterfaceImpl がクラス定義であることを示すキーワード
		// つまり、「public CalcInterfaceImpl」と書くな！とのこと。
	
	// CalcInterfaceImpl : 忘れがちだが、これが当クラスの名前。
	// implements : 「インターフェース」を「実装する」
	// 「CalcInterface」から指定されたすべての抽象メソッドを具体的に処理する義務を持つキーワード
	// いうと、この以下に書かれたのがその具体的な処理だ。
	
		@Override 
		// アノテーションと言われる特殊なマークの一種
		// コンパイラやほかのツールに対し、コードに関する「追加情報」を提供する。
		
		// @Override アノテーションは、主に以下の二つの目的で使用される。
		// コンパイラへの指示（エラーの検出） : 
			// これがかかったメソッドは、親クラス（superclass）のメソッドをオーバーライドしている。
			// もしくはインターフェースのメソッドを実装している。
			// とのことを「コンパイラ」に伝える機能を持つ。
		// 可読性の向上
			// 当メソッドがオーバーライド更田と一目で分かれるようにする。
			// デフォルトの文字色を調整した方が良い。
		
		public int add(int num1, int num2) {
			// public : メソッドがクラスの外部から呼び出し可能であることを示す。
			// 誰でもこのメソッドを呼び出せるのでセキュリティー的には良くないが、便利。
			// int : int型の値を返す
			// add : このメソッドの名前、別に違う名前に変更してもいい。
			// (int num1, int num2) : num1とnum2という二つのint型の引数を「受け取る」
			return num1 + num2;
			// で、足し算。
		}
		
		@Override
		public int subtract(int num1, int num2) {
			return num1 - num2;
			// 引き算
		}

		@Override
		public int multiply(int num1, int num2) {
			return num1 * num2;
			// 掛け算
		}

		@Override
		public int divide(int num1, int num2) {
			return num1 / num2;
			// 割り算
			// 要注意 : JAVAでは割り算の小数点以下は捨てられる。
			// 例 : 10 / 3 = 3
			// 0の対応も論外 : num1 / 0の場合、「java.lang.ArithmeticException」がスローされる。
			// そしてプログラムが異常終了される。
			// 
		}

		@Override
		public int remainder(int num1, int num2) {
			return num1 %  num2;
			// 余りを返す
			// divideと同じく、num2が0の場合のチェックがない。
			// num1 % 0 のような操作が行われた場合、java.lang.ArithmeticException がスローされる。
		}
}
