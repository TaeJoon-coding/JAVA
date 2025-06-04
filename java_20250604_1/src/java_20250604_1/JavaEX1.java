//package : ある機能を集めたもの（これも又、一つの単位） 
//=> class(一般・추상/예외/에러 처리 클래스), 
//インターフェース, 列挙型、 애너테이션, 레코드 など

package java_20250604_1;
//「java_20250604_1」：パッケージ名
//keyword : 予約語

public class JavaEX1 {
// public : 最も開放的な接近제어자（access modifier）
// class : クラスを表すキーワード
// JavaEX1 : クラス名(原則として、upper camel caseで作成)
// 구문(block) : { ... }

	// main + Ctrl + Space
	public static void main(String[] args) {
		// main メソッド（オブジェクト関数）：実行関数
		// public static void main(String[] args) {
		// static : （メモリー住所）固定的=>停的
		// void : リターン値がない
		// main : メソッド（関数）名
		// () : 인자부（매개변수부）
		
		// Sysout + Ctrl + Space
		System.out.println("JAVA");
		// System クラス
		// F2 => 一番右のアイコン：APT DOC
		// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/System.html
		// 「.」: System.out => Systemクラス所属のoutメンバーフィールド(変数)
		// out.println : outというオブジェクト（インスタンス）所属のprintlnメソッド
		// println : ln => line
		System.out.println("js　JAVAスクリプト");
	}
}
