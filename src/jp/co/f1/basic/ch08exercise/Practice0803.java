package jp.co.f1.basic.ch08exercise;

import java.util.Scanner;

public class Practice0803 {
	public static void main(String[] args) {
		//Scannerオブジェクトの生成
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("整数を入力してください。");
			//ユーザーからの入力を文字列として受け取る
			String inputLine = scanner.nextLine();
			
			try {
				//文字列を整数に変換
				int number = Integer.parseInt(inputLine);
				System.out.println(number + "の二乗は" + (number * number) + "です。");

				//正しい値があったのでループを抜ける
					break;
			} catch(NumberFormatException e) {
				System.out.println("不正な入力です。もう一度整数を入力してください。");
			}
		}
		//scannerをクローズ
		scanner.close();
	}

}
