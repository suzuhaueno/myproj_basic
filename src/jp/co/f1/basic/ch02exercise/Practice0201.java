package jp.co.f1.basic.ch02exercise;

class Person02 {
	String name;
	int age;
	
	public void showPerson() {
		System.out.println("この人の名前は" + name +"で、年齢は" + age +"歳です。");
		
	}
}
public class Practice0201 {
	public static void main(String[] args) {
		
		Person02 person1 = new Person02();
		Person02 person2 = new Person02();
		
		person1.name = "神田太郎";
		person1.age = 30;
		person2.name = "神田花子";
		person2.age = 20;
		
		person1.showPerson();
		person2.showPerson();
	}

}
