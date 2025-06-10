package jp.co.f1.basic.ch09exercise;
 
public class Practice0901 {
  public static void main(String[] args) {
    System.out.println("-------------------------------------------");
    Books book1 = new Books("Java入門", 2980);
    book1.showBookInfo(); //①と②の結果表示
   
    book1 = new Books("Java基礎",1500);
    book1.showBookInfo(); //③と④の結果表示

    Books book2 = book1;
    book2.showBookInfo(); //⑤と⑥の結果表示
    book2.setBookInfo("Java入門基礎", 3200);
    
    book1.showBookInfo(); //⑦と⑧の結果表示
 
  }
}
