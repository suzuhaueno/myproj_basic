package jp.co.f1.basic.ch02exercise;

class Person01 {
  String name; // 名前
  int age; // 年齢
 
  // フィールド変数の値を画面にメッセージとして出力する
  public void showPerson() {
    System.out.println("この人の名前は" + this.name + "で、年齢は" + this.age + "歳です。");
  }
}
