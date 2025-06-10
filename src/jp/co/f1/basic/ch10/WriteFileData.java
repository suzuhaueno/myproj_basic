package jp.co.f1.basic.ch10;

//ファイル出力処理に必要なクラス5~11行目
//バッファを介して書き込むクラス
import java.io.BufferedWriter;
//書き込みファイルを扱うクラス
import java.io.FileWriter;
//ファイル入出力関連を扱う例外クラス
import java.io.IOException;
//書き出し処理を行うクラス
import java.io.PrintWriter;

public class WriteFileData {
	public static void main(String[] args) {
		try {
			//書き込みファイルのオープン
			PrintWriter pw = new PrintWriter
					(new BufferedWriter(new FileWriter("output1.txt")));
			pw.println("■世界の挨拶");
			pw.println("日本語ではありがとう");
			
			//書き込みファイルのクローズ
			pw.close();
			System.out.println("ファイルの書き込みが終了しました。");
		} catch (IOException e) {
			System.out.println(e + "入出力エラーです。");
		}

	}

}
