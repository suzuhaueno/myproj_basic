package jp.co.f1.basic.ch04exercise;

public class Score2 {
	String name;
	int[] score = new int[5];
	int total;
	double ave;
	
	
	public Score2(String name, int[] score, int total, double ave) {
		
		this.name = name;
		this.total = total;
		this.ave = ave;
		for (int i = 0; i < score.length; i++) {
			this.score[i] = score[i];
		}
	} 
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
