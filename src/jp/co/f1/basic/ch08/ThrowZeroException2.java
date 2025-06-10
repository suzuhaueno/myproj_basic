package jp.co.f1.basic.ch08;

public class ThrowZeroException2 {
	public static void calcTest() {
		//数値を0で除算します。
		int num = 10 / 0;
		
		//結果を表示
		System.out.println("10 / 0の結果は" + num);
	}
	public static void main(String[] args) {
		try {
			//calcTestメソッドの呼び出し
			calcTest();
		} catch (ArithmeticException e) {
			//0除算の例外処理
			System.out.println("0で除算はできません。");
		}
		System.out.println("処理終了");
	}

}
