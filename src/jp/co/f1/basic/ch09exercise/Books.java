package jp.co.f1.basic.ch09exercise;

public class Books {
  private String title; //タイトル
  private int price; //価格
  //コンストラクタ
  public Books(String title,int price){
    this.title = title;
    this.price = price;
  }
 
 //引数を各フィールド変数に設定するメソッド
  public void setBookInfo(String title,int price){
    this.title = title;
    this.price = price;
  }

  //本の情報を画面に表示するメソッド
  public void showBookInfo(){
    System.out.println("この本のタイトルは「" + this.title + "」です。");
    System.out.println("この本の価格は「" + this.price + "」円です。");
    System.out.println("-------------------------------------------");
  }
}