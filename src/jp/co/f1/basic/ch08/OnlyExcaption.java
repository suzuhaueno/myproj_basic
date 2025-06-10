package jp.co.f1.basic.ch08;

public class OnlyExcaption {

	public static void main(String[] args) {
		try {
			//int型配列を定義
			int[] intArray = new int[5];
			
			//配列に数値を代入
			System.out.println("葉入れ鵜に数値を代入します。");
			intArray[10] = 50;
			
			//結果を表示
			System.out.println("配列に50を代入しました。");
			
			//例外発生
			int num = intArray[0] / 0;
			System.out.println("割り算の結果は" + num + "です。");
		} catch (Exception e) {
			System.out.println(e + "という例外が発生しました。");
		} finally {
			System.out.println("例外処理の最後の処理です。");
		}
		System.out.println("処理終了");
	}

}
