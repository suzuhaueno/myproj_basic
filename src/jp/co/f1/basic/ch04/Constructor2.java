package jp.co.f1.basic.ch04;

class Computer2 {
	private String os;
	private int memory;
	
	//引数ありのコンストラクタ
	public Computer2(String os, int memory) {
		//フィールド変数に初期化を設定
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" + "「" + memory + "MByteのパソコンを作成しました。");
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}
public class Constructor2 {

	public static void main(String[] args) {
		
		System.out.println("--「引数ありのコンストラクタ」の実行前--");
		Computer2 com = new Computer2("WindowsXP", 2048);
		System.out.println("--「引数ありのコンストラクタ」の実行後--");
		com.show();
	}

}
