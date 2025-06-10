package jp.co.f1.basic.ch10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//指定されたデータをテキストファイルへ書き込む
public class FileOut {
	//BufferedWriterクラス
	private BufferedWriter bw = null;
	
	//ファイルのオープンを行うメソッド
	public boolean open(String fname) {
		boolean sts = true;
		try {
			//書き込みファイルのオープンに相当する処理
			bw = new BufferedWriter(new FileWriter(fname));
		} catch (IOException e) {
			System.out.println("ファイル名に誤りがあります。\n");
			sts = false;
		}
		return sts;
	}
	
	//ファイルへのデータ書き込みを行うメソッド
	public boolean writeln(String str) {
		boolean sts = true;
		try {
			//1行分のデータをファイル出力
			bw.write(str);
			//行区切り文字を出力
			bw.newLine();
		} catch (IOException e) {
			System.out.println("書き込みエラー\n");
			sts = false;
		}
		return sts;
	}
	//ファイルのクローズを行うメソッド
	public boolean close() {
		boolean sts = true;
		try {
			//ファイルのクローズ
			bw.close();
		} catch (IOException e) {
			System.out.println("ファイルクローズエラー");
			sts = false;
		}
		return sts;
	}	

}
