package jp.co.f1.basic.ch09exercise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice0904 {
	//点数が格納された配列を引数に受け取り、その点数を全て表示
	//合計点を算出して表示
	public static void showSumScore(ArrayList<Integer> score) {
		//合計点格納用変数
		int sum = 0;
		for (int i = 0; i < score.size(); i++) {
			System.out.println((i + 1) + "人目の点数は「" + score.get(i) + "」です。");
			
			sum += score.get(i);
		}
		System.out.println("合計点は「" + sum + "」です。");
	}
	public static void main(String[] args) {
		//カウント変数
		int count = 0;
		//点数格納用配列
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		//Scannerオブジェクト生成
		Scanner sin = new Scanner(System.in);
		
		//繰り返し処理で5人分の点数入力を行う
		while(true) {
			try {
				//キーボードから点数入力
				System.out.println("点数を入力してください。");
				score.add(sin.nextInt());
				
				if (count == 4) {
					break;
				}
				count++;	
			} catch (InputMismatchException e) {
				System.out.println("正数値を入力してください!");
				//入力バッファのクリア
				sin.nextLine();
			}
		}
		System.out.println("--------------------------------------------------------------");
		//入力連数すべてと合計点を表示するメソッドを呼び出す
		showSumScore(score);
	}

}
