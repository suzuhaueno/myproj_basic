package jp.co.f1.basic.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//テキストファイルから入力されたデータを読み取ります。
public class FileIn {
	//Scannerクラス
	private Scanner sin = null;
	
	//ファイルオープンを行うメソッド
	public boolean open (String fname) {
		boolean sts = true;
		try {
			//読み込みファイルオープンに相当する処理
			sin = new Scanner(new File(fname));
		} catch (FileNotFoundException e) {
			System.out.println("ファイル名に誤りがあります。\n" + e);
			sts = false;
		}
		return sts;
	}
	//読み込んだファイルデータから1行読み出し処理を行うメソッド
	public String readLine() {
		String buff;
		
		//読み込み可能データがあるか判定
		if (sin.hasNextLine()) {
			buff = sin.nextLine();
		} else {
			buff = null;
		}
		return buff;
	}
	
	public boolean close() {
		boolean sts = true;
		try {
			sin.close();
		} catch (Exception e) {
			System.out.println("ストリームクローズエラー");
			sts = false;
		}
		return sts;
	}
	
}
