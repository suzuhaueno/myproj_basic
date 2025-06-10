package jp.co.f1.basic.ch02;

class Computer6 {
	String os;
	int memory;
	
	//フィールド変数の値を表示するメソッド
	public void show() {
		System.out.println("OSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
	
}
public class NoInitializationObjectVariable {
	public static void main(String[] args) {
		//Computer6型のオブジェクト変数comを定義
		Computer6 com;
		
		//showメソッドにアクセス
		//オブジェクト変数comを宣言しただけでは中身が空っぽで何も入っていない(初期化されていない)ので
		//コンパイルエラーが出る
//		com.show();

	}

}
