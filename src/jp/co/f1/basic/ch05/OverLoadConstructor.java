package jp.co.f1.basic.ch05;

class Computer3 {
	private String os;
	private int memory;
	
	//引数なしコンストラクタ
	public Computer3() {
		this.os = null;
		this.memory = 0;
	}
	
	//引数2つもつコンストラクタ
	public Computer3(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリのサイズは「" + memory + "MByte」のパソコンを作成しました。");
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory +"」です。");
	}
}
public class OverLoadConstructor {
	public static void main(String[] args) {
		//オブジェクトの作成、オーバーロード引数なしコンストラクタ
		Computer3 com1 = new Computer3();
		com1.show();
		System.out.println("----------------------------------------------------------------------");
		
		//オブジェクト生成、オーバーロード引数ありコンストラクタ
		Computer3 com2 = new Computer3("WindowsXP",2048);
		com2.show();

	}

}
