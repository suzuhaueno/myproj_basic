package jp.co.f1.basic.ch08exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice0801 {
	public static void main(String[] args) {
		//入力数
		int cnt = 0;
		//合計点
		int sum = 0;
		//平均点（小数点以下切り捨て）
		int ave = 0;
		//入力数値を格納する配列
		int[] num = new int[3];
		
		//Scannerクラスをオブジェクト化
		Scanner sin = new Scanner(System.in);
		//繰り返し処理（配列の要素数分）
		while (true) {
			try {
			
				//キーボードより数値を入力し配列に格納
				System.out.println("数値を入力してください。(999で強制終了)＞");
				int tmpNum = sin.nextInt();
				
				//入力数値が999なら強制でループを抜ける
				if (tmpNum == 999) {
					break;
				}
				//配列にデータを入れる
				num[cnt] = tmpNum;
				//入力数をカウントアップ
				cnt++;
			} catch (InputMismatchException e) {
				System.out.println("文字が入力されました。整数を入力してください。");
				sin.next();
			}
		}
		for (int i = 0; i < cnt; i++) {
			//入力数値を合計点へ加点
			sum += num[i];			}
			//平均点の計算
			ave = sum / cnt;
			//各結果を画面に出力
			System.out.println("入力数は" + cnt + "です。");
			System.out.println("合計点は" + sum + "です。");
			System.out.println("平均点は" + ave + "です。");
	
	}
}