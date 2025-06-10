package jp.co.f1.basic.ch06;

class Computer3 {
	private String os;
	private int memory;
	//クラス変数
	public static int sum;
	
	//コンストラクタ
	public Computer3 () {
		this.os = null;
		this.memory = 0;
		//コンストラクタ内でクラス変数sumにアクセスする
		sum++;
		System.out.println("パソコンを作成しました。");
	}
	
	public void setOsMemory(String os, int memory) {
		this.os = os;
		this.memory = 0;
		System.out.println("OSを「" + os + "」メモリを「" + memory + "MByte」に変更しました。");
	}
	public static void showSum () {
		System.out.println("■" + sum + "台作成されています。");
	}
	
	public void checkSum() {
		//インスタンスメソッド内でクラス変数sumにアクセスする
		if (sum > 2) {
			System.out.println("■" + sum + "台のコンピュータが作成されたので、メンテナンスを実施してください。");
		} else {
			System.out.println("■" + sum + "台目なので、まだメンテナンスは必要ありません。");
		}
	}
	
}

public class ClassMemberFromInstanceMethod {
	public static void main(String[] args) {
		//Computer3オブジェクトcom1生成1回目
		Computer3 com1 = new Computer3();
		com1.setOsMemory("WindowsXP", 2048);
		com1.checkSum();
		
		//Computer3オブジェクトcom2生成2回目
		Computer3 com2 = new Computer3();
		com2.setOsMemory("Windows2000", 512);
		com2.checkSum();
		
		//Computer3オブジェクトcom3生成3回目
		Computer3 com3 = new Computer3();
		com3.setOsMemory("WindowsVista", 3072);
		com3.checkSum();
	}

}
