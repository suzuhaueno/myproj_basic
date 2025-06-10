package jp.co.f1.basic.ch02;

class Computer5 {
	String os;
	int memory;
	
	public void showComputer() {
		System.out.println("パソコンの情報を表示します。");
		//クラス内のshowメソッドを呼び出す
		show();
	}
	
	//フィールド変数の値を表示するメソッド
	public void show() {
		System.out.println("OSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "」です。");
	}
	
	//フィールド変数よりOSの値を取得する
	public String getOs() {
		return os;
	}
	
	//フィールド変数のmemoryの値を取得する
	public int getMemory() {
		return memory;
	}
	
	//フィールド変数に値を設定するメソッド
	public void setOsMemory(String name, int size) {
		os = name;
		memory = size;
		System.out.println("OSを「" + name + "」に、メモリサイズを「 " + size + "MByte」に変更しました。");
	}
}
public class InstanceMethod2 {
	public static void main(String[] args) {
		
		//Computer5クラスからオブジェクトを生成
		Computer5 com = new Computer5();
		
		//オブジェクトのフィールド変数に各データを格納
		com.os = "WindowsXP";
		com.memory = 2048;
		
		//メソッドを利用してフィールド変数に格納しているデータを取得
		System.out.println("パソコンのOSは「" + com.getOs() + "」です。");
		System.out.println("メモリのサイズは「" + com.getMemory() + "MByte」です。");
	
		//オブジェクトのフィールド変数に格納しているデータを取得
		com.setOsMemory("Windows2000", 512);
		
		//showComputerメソッドの呼び出し
		com.showComputer();
	}

}
