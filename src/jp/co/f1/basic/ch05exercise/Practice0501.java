package jp.co.f1.basic.ch05exercise;

class Calc2 {
	private int num1;
	private int num2;
	
	public int addition (int num1, int num2) {
		return (num1 + num2) ;
	}
	
	public double addition (double num1, double num2) {
		return (num1 + num2);
	}
}
public class Practice0501 {
	public static void main(String[] args) {
		//Calcオブジェクトの生成
		Calc2 clac = new Calc2();
		
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + " + " + num2 + " = " + clac.addition(num1, num2));
	
		double num3 = 45.2;
		double num4 = 16.9;
		System.out.println(num3 + " + " + num4 + " = " + clac.addition(num3, num4));
	}

}
