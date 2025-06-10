package jp.co.f1.basic.ch10;
//読み込みファイルに関する情報を扱うクラス
import java.io.File;
//ファイルが見つからな買った場合の例外クラス
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileShowData {
	public static void main(String[] args) {
		try {
			//Scannerクラスのオブジェクト化
			Scanner sin = new Scanner(new File("Sample.txt"));
			
			//1行ずつ読み込むnext.Line
			String strLine1 = sin.nextLine();
			String strLine2 = sin.nextLine();
			
			System.out.println(strLine1);
			System.out.println(strLine2);
			
			//ストリームのクローズ
			sin.close();
		} catch (FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません。");
		}

	}

}
