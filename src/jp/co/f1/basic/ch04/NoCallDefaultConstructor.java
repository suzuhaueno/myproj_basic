package jp.co.f1.basic.ch04;

class Computer5{
	private String os;
	private int memory;
	
	//コンストラクタ
	private Computer5(String os, int memory) {
		//フィールド変数に初期値を設定
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os +"」メモリのサイズは「" + memory +"MByte」のパソコンを作成しました。");
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリのサイズは「" + memory + "MByte」です。");
	}
}
public class NoCallDefaultConstructor {
	public static void main(String[] args) {
		System.out.println("--「引数ありのコンストラクタ」の実行前--");
//		Computer5 com = new Computer5();
		System.out.println("--「引数ありのコンストラクタ」の実行後--");
//		com.show();

	}

}
