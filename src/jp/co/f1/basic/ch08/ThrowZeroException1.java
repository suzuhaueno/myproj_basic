package jp.co.f1.basic.ch08;


public class ThrowZeroException1 {
	static public void calcTest() {
		//0で除算します。
		int num = 10 / 0;
		
		//結果を表示
		System.out.println("10 / 0の結果は" + num);
	}
	public static void main(String[] args) {
		//calcTestメソッドの呼び出し
		calcTest();
		
		System.out.println("処理終了");

	}

}
