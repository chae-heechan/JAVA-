/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.10.02.
	���α׷���: JAVA���α׷��� ���� 4-4
*/
public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "���ڹ̻�";
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book LittlePrince = new Book("�����", "�������丮");
		Book LoveStory = new Book("������");
		System.out.println(LittlePrince.title + " " + LittlePrince.author);
		System.out.println(LoveStory.title + " " + LoveStory.author);
	}
}
