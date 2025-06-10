package jp.co.f1.basic.ch06;

class Computer2 {
	//インスタンス変数
	private String os;
	//インスタンス変数
	private int memory;
	//クラス変数
	public static int sum;
	
	//コンストラクタ
	public Computer2() {
		this.os = null;
		this.memory = 0;
		sum++;
		System.out.println("パソコンを作成しました。");
	}
	
	//インスタンスメソッド
	public void setOsMemory (String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OSを「" + os + "」にメモリを「" + memory + "MByte」です。");
	}
	
	//インスタンスメソッド
	public  void show() {
		System.out.println("パソコンのOSは「" + os +"」です。");
		System.out.println("メモリのサイズは「" + memory + "MByte」です。");
	}
	
	//クラスメソッド
	public static void showSum() {
		System.out.println("■パソコンは合計" + sum + "台作成されています。");
	}
}
public class ClassMember {
	public static void main(String[] args) {
		//クラス変数sumにアクセスし0で初期化
		Computer2.sum = 0;
		//クラスメソッドshowSumにアクセス1回目(オブジェクト生成前)
		Computer2.showSum();
		
		Computer2 com1 = new Computer2();
		com1.setOsMemory("WindowsXP", 2048);
		com1.show();
		//クラスメソッドshowSumにアクセス2回目(オブジェクト生成後)
		Computer2.showSum();
		
		Computer2 com2 = new Computer2();
		com2.setOsMemory("Windows2000", 512);
		com2.show();

		Computer2.showSum();
	}

}
