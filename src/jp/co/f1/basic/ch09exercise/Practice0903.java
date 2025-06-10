package jp.co.f1.basic.ch09exercise;

public class Practice0903{
	public static void main(String[] args) {
		// 本情報を配列に設定
		String[] title  = {"java超入門", "Java入門", "Java基礎", "Java応用", "Java超応用"};
		int[] price = {800, 1200, 1800, 2500, 3000};
		
		Books[] book = new Books[5];
		
		//各オブジェクトに各情報を設定
		for (int i = 0; i < book.length; i++) {
			book[i] = new Books(title[i],  price[i]);
		}
		//各オブジェクトの情報を表示
		System.out.println("------------------------------------------------------------");
		for (int j = 0; j < book.length; j++) {
			book[j].showBookInfo();
		}
	}
}