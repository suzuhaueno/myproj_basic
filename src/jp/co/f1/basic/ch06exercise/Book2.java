package jp.co.f1.basic.ch06exercise;

public class Book2 {

	class Book1 {
		private static int count;
		private String title;
		private int price;
		private int number;
		
		//コンストラクタ
		public Book1 (String title, int price) {
			count++;
			this.title = null;
			this.price = 0;
			this.number = count;
				
		}
		
		public void showBook () {
			System.out.println("この本のタイトルは" + title + "、価格は" + price + "です。" );
			System.out.println("生成番号は" + number + "です。");
		}
		
		public static int getCount () {
			return count;
		}
}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
