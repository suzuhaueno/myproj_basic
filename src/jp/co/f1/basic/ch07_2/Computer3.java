package jp.co.f1.basic.ch07_2;

//Computer3クラスを他から利用できるようにpublicをつけている
public class Computer3 {
	private String os;
	private int memory;
	
	public void show() {
		System.out.println("OSは「" + this.os + "」です。");
		System.out.println("メモリサイズは「" + this.memory + "MByte」です。");
	}
	
	public void setOsMemory(String os, int memory) {
		//引数の値をフィールド変数に設定
		this.os = os;
		this.memory = memory;
	}
}
