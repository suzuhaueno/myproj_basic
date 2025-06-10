package jp.co.f1.basic.ch03exercise;


class Books3 {
	private String title;
	
	private int price;
	
	void show() {
		System.out.println("この本のタイトルは" + this.title + "」で、値段は" + this.price +"です。");
	}
//ゲッターメソッドは、値を外部から読み取るときに使う
	public String getTitle() {
		return this.title;
	}
	
	public int getPrice() {
		
		return this.price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(int price) {
		
		if (price < 0) {
			this.price = 0; 
			System.out.println("設定する値が" + price + "のため、価格を0に設定しました。");
		} else {
			this.price = price;
		}
	}
}


public class Practice0301 {

	public static void main(String[] args) {
		Books3 com1 = new Books3();
		Books3 com2 = new Books3();
		
		com1.setTitle("Java入門テキスト");
		com1.setPrice(2580);
		
		com1.show();
		
		com2.setTitle("Java基礎テキスト");
		com2.setPrice(-3800);
		
		com2.show();

	}

}
