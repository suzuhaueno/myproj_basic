//SamePackgeクラスをパッケージに含める
package jp.co.f1.basic.ch07_1;

public class SamePackage {
	public static void main(String[] args) {
		//Computer2クラスのオブジェクト化
		Computer2 com = new Computer2();
		//OSとメモリの値を設定
		com.setOsMemory("Windows7",20480);
		//コンピュータの情報を確認
		com.show();
	}

}
