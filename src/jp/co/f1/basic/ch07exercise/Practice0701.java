package jp.co.f1.basic.ch07exercise;

public class Practice0701 {

	public static void main(String[] args) {
		//Booksクラスをインスタンス化
		Books book = new Books();
		
		book.setTitle("Java基礎テキスト");
		book.setPrice(2980);
		
		System.out.println("本のタイトルは" + book.getTitle());
		System.out.println("本の価格は" + book.getPrice());

	}

}
