package jp.co.f1.basic.ch10exercise;

//ファイルの読み込み
import java.io.BufferedReader;
//ファイル読み込み
import java.io.FileReader;
//入出力エラー
import java.io.IOException;
//リストデータ構造
import java.util.ArrayList;

public class EmployeeReportGenerator {

	private static String inputFile;

	public static void main(String[] args) {
		System.out.println("プログラムを開始します。");
		
		ArrayList<String> employeeIds = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> department = new ArrayList<String>();
		ArrayList<String> salaries = new ArrayList<String>();
		
		System.out.println(inputFile + " の読み込みを開始します...");
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
		    String line; // 1行分のデータを格納する変数

		    // ヘッダー行を読み飛ばす (CSVの1行目は項目名なので、データとしては使わない)
		    br.readLine(); 

		    // 1行ずつ読み込み、行がなくなる (nullになる) まで繰り返す
		    while ((line = br.readLine()) != null) {
		        // 読み込んだ1行をカンマで分割する
		        String[] data = line.split(",");

		        // 分割したデータが期待通り4つあるか確認 (念のため)
		        if (data.length == 4) {
		            employeeIds.add(data[0].trim()); // 社員ID (trim()で前後の空白を除去)
		            names.add(data[1].trim());       // 氏名
		            department.add(data[2].trim()); // 部署名
		            // 月給は文字列なので、整数 (Integer) に変換して追加
		            salaries.add(Integer.parseInt(data[3].trim()), line); 
		        }
		    }
		    System.out.println(inputFile + " の読み込みが完了しました。");

		    // ---- ここで、読み込んだデータが正しくリストに入っているか確認してみましょう (デバッグ用) ----
		    System.out.println("--- 読み込みデータ確認 ---");
		    for (int i = 0; i < employeeIds.size(); i++) {
		        System.out.println("ID: " + employeeIds.get(i) +
		                           ", 名前: " + names.get(i) +
		                           ", 部署: " + department.get(i) +
		                           ", 給与: " + salaries.get(i));
		    }
		    System.out.println("------------------------");


		} catch (IOException e) {
		    System.err.println(inputFile + " の読み込み中にエラーが発生しました: " + e.getMessage());
		    // e.printStackTrace(); // より詳細なエラー情報を確認したい場合
		    System.exit(1); // エラーが発生したらプログラムを終了
		} catch (NumberFormatException e) {
		    System.err.println("給与データの形式が不正です。数値に変換できませんでした: " + e.getMessage());
		    // e.printStackTrace();
		    System.exit(1);
		}

		
		
		System.out.println("プログラムを終了します。");
	}

}
