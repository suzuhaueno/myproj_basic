package jp.co.f1.basic.ch06exercise;

import java.util.Scanner;

class Book3 {
	private static int count = 0;
	private String title;
	private int price;
	private int number;
	
	//コンストラクタ
	public Book3 (String title, int price) {
		++count;
		this.title = title;
		this.price = price;
		this.number = count;
			
	}
	
	public void showBook () {
		System.out.println("この本のタイトルは" + this.title + "、価格は" + this.price + "です。" );
		System.out.println("生成番号は" + this.number + "です。");
	}
	
	public static int getCount () {
		return count;
	}
}

public class Practice0602 {
	public static void main(String[] args) {
		//スキャナークラスのオブジェクト化
		Scanner sin = new Scanner(System.in);
		//3回ループするfor文
		for (int i = 0; i < 3; i++) {
			
			System.out.println("タイトルを入力してください->");
			String title = sin.next();
			
			System.out.println("本の価格を入力してください->");
			int price = sin.nextInt();
			
			Book3 book = new Book3(title, price);
			
			book.showBook();
			
			System.out.println();
		}
		
		System.out.println("■本の生成回数は「" + Book3.getCount() +"」回です。");

	}

}
