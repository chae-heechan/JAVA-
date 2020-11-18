/*
 	작성자: 20174046 채희찬
 	작성일: 2020.10.02.
	프로그램명: JAVA프로그래밍 예제 4-4
*/
public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "작자미상";
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book LittlePrince = new Book("어린왕자", "생텍쥐페리");
		Book LoveStory = new Book("춘향전");
		System.out.println(LittlePrince.title + " " + LittlePrince.author);
		System.out.println(LoveStory.title + " " + LoveStory.author);
	}
}
