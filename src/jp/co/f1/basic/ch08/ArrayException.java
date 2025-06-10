package jp.co.f1.basic.ch08;

public class ArrayException {
	public static void main(String[] args) {
		//int型配列を定義
		int[] intArray = new int[5];
		
		//添え字10に値を代入
		System.out.println("intArray[10]に数字を代入します。");
		//最大配列要素を超えた代入処理
		intArray[10] = 50;
		
		//結果を表示
		System.out.println("intArray[10]に50を代入しました。");
		System.out.println("処理終了");

	}

}