package jp.co.f1.basic.ch08;

public class ArrayException1 {

	public static void main(String[] args) {
		try {
			int[] intArray = new int[5];
			
			System.out.println("intArray[10]に数値を代入します。");
			intArray[10] = 50;
			
			System.out.println("intArray[10]に50を代入します。");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えています。");
		}
		System.out.println("処理終了");

	}

}
