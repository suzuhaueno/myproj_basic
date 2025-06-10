package jp.co.f1.basic.ch06;

class Computer4 {
	private String os;
	private int memory;
	public static int sum;
	
	//コンストラクタ
	public Computer4 () {
		this.os = null;
		this.memory = 0;
		sum++;
		System.out.println("パソコンを作成しました。");
	}
	
	public void setOsMemory(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OSを「" + os + "」にメモリを「" + memory +"MByte」に変更しました。");
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリのサイズは「" + memory + "MByte」です。");
	}
//	
//	public static void showSum() {
//		System.out.println("■パソコンの合計" + this.sum +"台作成されています。");
//		System.out.println("パソコンのメモリは「" + memory + "MByte」です。");
//		show();
//	}
}
public class NoAccessFromClassMember {
	public static void main(String[] args) {
		Computer4.sum = 0;
//		Computer4.showSum();
		
		Computer4 com1 = new Computer4();
		com1.setOsMemory("WindowsXP", 2048);
		com1.show();
//		Computer4.showSum();
		
		Computer4 com2 = new Computer4();
		com2.setOsMemory("Windows2000", 512);
		com2.show();
//		Computer4.showSum();

	}

}
