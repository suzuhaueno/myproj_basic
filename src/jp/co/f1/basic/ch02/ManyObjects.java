package jp.co.f1.basic.ch02;

class Computer3 {
	String os;
	int memory;
}

public class ManyObjects {
	public static void main(String[] args) {
		//同じComputer3クラスから2つのオブジェクトを生成する
		Computer3 com1 = new Computer3();
		Computer3 com2 = new Computer3();
		
		//個々のオブジェクトのフィールド変数に各データを格納する
		com1.os = "WindowsXP";
		com1.memory = 2048;
		com2.os = "Windows2000";
		com2.memory = 512;
		
		//個々のオブジェクトのフィールド変数の値を参照し、結果を画面に表示する
		System.out.println("パソコン1のOSは「" + com1.os + "」です。");
		System.out.println("メモリのサイズは「" + com1.memory + "MByte」です。");
		System.out.println("パソコン2のOSは「" + com2.os + "」です。");
		System.out.println("メモリのサイズは「" + com2.memory + "MByte」です。");

	}

}
