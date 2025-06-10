package jp.co.f1.basic.ch10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileManyData {
	public static void main(String[] args) {
		//書き込み用データを配列に用意
		String[] strArray = {"■世界のありがとう",
				"日本語はありがとう",
				"韓国語はカムサハムニダ",
				"英語はサンキュー",
				"中国語はシェシェ",
				"ネパール語はダンニャバード",
				"ドイツ語はダンケ　シェーン",
				"スペイン語はグラシアス",
				"フランス語はメルスィーボクー",
				"タイ語はコー（プ）クンマーグ",
				"ベトナム語はカム　オンアイム",
				"ハワイ語はマハロ"};
		try {
			//書き込みファイルオープン
			PrintWriter pw = new PrintWriter
					(new BufferedWriter(new FileWriter("output2.txt")));
			
			//繰り返し処理で書き込みを行う
			for (int i = 0; i < strArray.length; i++) {
				pw.println(strArray[i]);
			}
			pw.close();
			System.out.println("ファイルに書き込みが終了");
			//コンピュータが外部のデータを読み込んだり、
			//外部にデータを書き出したりするときに予期せぬトラブルが発生するエラー
		} catch (IOException e) {
			System.out.println(e + "入出力エラーです。");
		}

	}

}
