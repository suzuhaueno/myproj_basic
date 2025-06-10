package jp.co.f1.basic.ch09;

import java.util.ArrayList;

public class UseArrayList6 {
	public static void main(String[] args) {
		//文字列を扱うArrayList配列の追加
		ArrayList<String> strList = new ArrayList<String>();
		
		//文字列の追加
		strList.add("Good morning");
		strList.add("Hello");
		strList.add("Bye");
		
		//繰り返し処理を利用して全件表示
		System.out.println("■変更前のデータ一覧");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println((i + 1 ) + "つ目の追加データは「" + strList.get(i) + "」です。");
		}
		//3つ目のデータを変更
		strList.set(2, "Good Bye!");
		//2つ目のでデータ削除
		strList.remove(1);
		
		System.out.println("\n■変更後のデータ一覧");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println((i + 1) + "つ目の追加データは「" + strList.get(i) + "」です。");
		}

	}

}
