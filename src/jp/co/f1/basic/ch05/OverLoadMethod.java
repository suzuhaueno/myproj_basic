package jp.co.f1.basic.ch05;

class Computer1 {
	private String os;
	private int memory;
	
	//オーバーロードメソッド1
	public void setComputer(String os) {
		this.os = os;
		System.out.println("OSを「" + os + "」に変更しました。");
	}
	
	//オーバーロードメソッド2
	public void setComputer(int memory) {
		this.memory = memory;
		System.out.println("メモリサイズを「" + memory + "MByte」に変更しました。");
	}
	
	//オーバーロードメソッド3
	public void setComputer(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ「" + memory +"MByte」に変更しました。");
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリのサイズは「" + memory + "MByte」です。");
	}
}

public class OverLoadMethod {
	public static void main(String[] args) {
		//オブジェクト生成
		Computer1 com = new Computer1();
		
		//引数2個で引数の型がString型、int型の並び順のsetComputerメソッド呼び出し
		com.setComputer("WindowsXP",2048);
		com.show();
		System.out.println("-------------------------------------------------------------------------------");
		
		//引数String型のsetComputerメソッドの呼びだし
		com.setComputer("WindowsXP");
		com.show();
		System.out.println("-------------------------------------------------------------------------------");
		
		//引数int型のsetComputerメソッドの呼び出し
		com.setComputer(512);
		com.show();
		
	}

}
