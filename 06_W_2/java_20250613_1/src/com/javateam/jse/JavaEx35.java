package com.javateam.jse;

public class JavaEx35 {

	// 例外とエラー（Exception & Error）
	// 一般例外 : 
	// ランタイム例外 : 実行しないと分からない。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 6;
		int num2 = (int)Math.random() * 10;
		int result = 0;
		int arr[] = new int[3];
		
		try {
			
			if (num2 == 0) {
				// throw new ArithmeticException("0が入力されました。");
				throw new Exception();
			}
			
			arr[4] = 1;
			
			result = num1 / num2;
			
		} catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
			System.out.println("msg : " + e.getMessage());
			System.out.println("e : " + e);
			e.printStackTrace();
			System.err.println("メッセージ : 0で割った");
		} catch (Exception e ) {
			
		}
		// catch (ArrayIndexOutOfBoundsException e) {
		
			System.err.println("配列インデックスエラー");
		//}
	}

}
