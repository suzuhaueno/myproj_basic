package jp.co.f1.basic.ch02;

class Computer1 {
	String os;
	int memory;
}

public class MakeObject {

	public static void main(String[] args) {
		Computer1 com;
		com = new Computer1();
		//オブジェクト実態の場所情報が出力される
		System.out.println("com =" + com);

	}

}
