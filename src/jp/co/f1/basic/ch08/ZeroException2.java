package jp.co.f1.basic.ch08;

public class ZeroException2 {

	public static void main(String[] args) {
		try {
			//数値を0で除算します。
			int num = 10 / 0;
			//結果の表示
			System.out.println("10 / 0の結果は" + num);
		} catch (ArithmeticException e) {
			System.out.println("0で除算できません。");
		}
		System.out.println("処理終了");

	}

}
