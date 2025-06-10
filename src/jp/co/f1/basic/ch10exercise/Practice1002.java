package jp.co.f1.basic.ch10exercise;

import jp.co.f1.basic.ch10.FileIn;
import jp.co.f1.basic.ch10.FileOut;

public class Practice1002 {
	public static void main(String[] args) {
		//読み込みファイルの1行データ格納用変数
		String strLine = null;
		//提供されるクラスのオブジェクト化
		FileIn in =  new FileIn();
		FileOut out = new FileOut();

		//書き込みファイルのオープン
		if (out.open("practice.txt") == false) {
			System.exit(1);
		}
		
		//文字列の書き込み
		out.writeln("[java基礎入門");
		out.writeln("ファイル入出力の練習問題を実施中");
		
		//書き込みファイルのクローズ
		if (out.close() == false) {
			System.exit(2);
		}
		
		//ファイルの読み込み
		if(in.open("practice.txt") == false) {
			System.exit(3);
		}
		
		//繰り返し処理で読み込んだデータ全てを読み出す
		while ((strLine = in.readLine()) != null) {
			System.out.println(strLine);
		}
		//ストリームのクローズ
		if (in.close() == false) {
			System.exit(4);
		}
	}

}
