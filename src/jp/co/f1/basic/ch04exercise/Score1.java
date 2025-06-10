package jp.co.f1.basic.ch04exercise;

public class Score1 {
	String name;
	int[] score = new int[5];
	int total;
	double ave;
	
	
	public Score1() {
		name = null;
		total = 0;
		ave = 0.0;
		for(int i = 0; i < this.score.length; i++) {
			this.score[i] = 0;
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
