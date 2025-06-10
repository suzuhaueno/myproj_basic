package jp.co.f1.basic.ch09;

public class StringSplit {

	public static void main(String[] args) {
		//変数宣言
		String str1 = "12345";
		String str2 = "AB:CD:EF";
		
		//substringメソッドを利用して任意の位置で分割
		System.out.println("「" + str1 + "」の先頭から3番目の文字は「" + str1.substring(0, 3) +"」です。");
		System.out.println("「" + str2 +"」の3文字目から最後の文字は「" + str2.substring(2) +"」です。\n");

		
		//splitメソッドを利用して指定文字「：」で分割
		String[] strArray = str2.split(":");
		
		//分割された分数だけループ処理
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("「:」で分割した" + (i + 1) +"つ目の文字は「" + strArray[i] +"」です。");
		}
	}

}
