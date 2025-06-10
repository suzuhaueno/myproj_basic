package jp.co.f1.basic.ch08;

public class ManyCatch {

	public static void main(String[] args) {
		try {
			//int型配列を定義
			int[] intArray = new int[5];
			
			//配列に値を代入
			System.out.println("配列に数値を代入します。");
			//例外の発生
			intArray[10] = 50;
			//正しく代入
			//intArray[0] = 50;
			System.out.println("配列に50を代入しました。");
			
			//例外を発生させる除算
			int num = intArray[0] / 0;
			System.out.println("割り算の結果は" + num + "です。");
			//最大配列要素を超えた例外処理
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えています。");
		} catch (ArithmeticException e) {
			System.out.println("0の除算はできません。");
		} finally {
			System.out.println("例外処理の最後");
		}
		System.out.println("終了処理");

	}

}
