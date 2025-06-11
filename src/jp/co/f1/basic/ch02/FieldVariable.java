package jp.co.f1.basic.ch02;

class Computer2 {
	String os;
	int memory;
}

public class FieldVariable {

	public static void main(String[] args) {

		Computer2 com = new Computer2();

		com.os ="windowsXP";
		com.memory = 2048;

		System.out.println("パソコンのOSは「" + com.os + "」です。");
		System.out.println("メモリのサイズは「" + com.memory + "MByte」です。");
		System.out.println();
	}

}
