//Computer2クラスのをパッケージ含める
package jp.co.f1.basic.ch07_1;

public class Computer2 {
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
