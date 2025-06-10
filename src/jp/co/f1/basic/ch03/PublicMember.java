package jp.co.f1.basic.ch03;

class Computer3 {
	private String os;
	private int memory;
	
	//publicメソッドのshow
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリのサイズは「" + memory + "MByte」です。");
	}
	
	//publicメソッドのsetMemory
	public void setOsMemory(String os, int memory) {
		//設定するメモリの値が正常化判定する
		if (memory >0) {
			//正常な引数値をフィールド変数に設定
			this.os = os;
			this.memory = memory;
			System.out.println("OSを「" + this.os + "」にメモリを「" + this.memory +"」に変更しました。");
		} else {
			System.out.println("「" + memory + "」は正しいメモリサイズではないため、変更は行いません。");
		}
	}
}

public class PublicMember {
	public static void main(String[] args) {
	
		Computer3 com = new Computer3();
		//正しい値を正式な操作を呼び出して設定
		//publicメソッドsetOsMemoryを呼び出して値を設定
		com.setOsMemory("WindowsXP", 2048);
		//publicメソッドshowを呼び出す
		com.show();
		//不正な値を入れようとしてみる
		System.out.println("\nメモリに不正な値(-5445)を指定してみます。");
		com.setOsMemory("WindowsXP", -5445);
		com.show();

	}

}
