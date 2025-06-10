package jp.co.f1.basic.ch08;

public class ZeroException {

	public static void main(String[] args) {
		//数値を0で除算します。
		int num = 10 / 0;
		
		//結果を表示
		System.out.println("10 / 0の結果は" + num);
		System.out.println("処理終了");
	}

}
