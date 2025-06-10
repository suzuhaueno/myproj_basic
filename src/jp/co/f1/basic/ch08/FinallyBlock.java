package jp.co.f1.basic.ch08;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			//int型配列を定義
			int[] intArray = new int[5];
			
			//配列に値を代入
			System.out.println("配列に数値を代入します。");
			//例外を発生させる
			intArray [10] = 50;
			//正しく代入
			//intArray [10] = 50;
			
			//結果を表示
			System.out.println("配列に50を代入しました。");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えています。");
		} finally {
			System.out.println("例外処理の最後処理です。");
		}
		System.out.println("処理終了");

	}

}
