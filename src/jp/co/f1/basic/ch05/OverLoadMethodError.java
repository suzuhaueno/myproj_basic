package jp.co.f1.basic.ch05;

//class Computer2 {
//	private String os;
//	private int memory;
//	
//	//オーバーロードメソッド1
//	public void setComputer(String os) {
//		this.os = os;
//	}
//	
//	//オーバーロードメソッド2
//	public String setComputer(String os) {
//		String oldOs = this.os;
//		this.os = os;
//		return oldOs;
//	}
//	
//	//オーバーロードメソッド4
//	public void setComputer(String os1, int memory1) {
//		this.os = os1;
//		this.memory = memory1;
//	}
//	
//	//オーバーロードメソッド5
//	public void setComputer(String os2, int memory2);
//}
//public class OverLoadMethodError {
//	public static void main(String[] args) {
//		//オブジェクト生成
//		Computer2 com = new Computer2();
//		com.setComputer("WindowsXp");
//		com.setComputer("WindowsXP", 1024) ;
//
//	}
//
//}
//オーバーロードのルールに従ってないからエラーが出る