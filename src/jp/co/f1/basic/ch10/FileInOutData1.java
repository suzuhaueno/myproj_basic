package jp.co.f1.basic.ch10;

import java.io.*;
import java.util.*;


public class FileInOutData1 {
	public static void main(String[] args) {
		//合格点格納変数
		int sum = 0;
		//平均点格納用変数
		double ave = 0.0;
		//読み込みデータの分割格納用
		String[] strData = null;
		
		//教科格納用配列
		ArrayList<String> subjectList = new ArrayList<String>();
		//点数格納用配列
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		
		try {
			//教科データファイルの読み込み
			Scanner sin = new Scanner(new File("subject_data.csv"));
			//全データを配列に読み込む
			while(sin.hasNextLine()) {
				//読み込み1行 データカンマで分割
				strData = sin.nextLine().split(",");
				
				//各配列にデータを格納
				subjectList.add(strData[0]);
				scoreList.add(Integer.parseInt(strData[1]));
			}
			//ストリームのクローズ
			sin.close();
			System.out.println("ファイルの読み込みが終了しました。");
			
			//書き込みファイルオープン
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("statistics.txt")));
			
			//読み込みデータファイルをファイルに書き込む
			for (int i = 0; i < subjectList.size(); i++) {
				pw.println(subjectList.get(i) + "<--->" + scoreList.get(i));
			}
			//合計点を算出してファイルに書き込む
			for (int i = 0; i < scoreList.size(); i++) {
				sum += scoreList.get(i);
			}
			pw.println("合計点：" + sum);
			
			ave = (double) sum / scoreList.size();
			pw.println("平均点：" + ave);
			
			//書き込みファイルのクローズ
			pw.close();
			System.out.println("ファイルへの書き込みが終了しました。");
		} catch (FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません。");
		} catch (IOException e) {
			System.out.println(e + "入出力エラーです。");
		}

	}

}
