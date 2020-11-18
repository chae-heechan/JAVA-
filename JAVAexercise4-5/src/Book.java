/*
 	작성자: 20174046 채희찬
 	작성일: 2020.10.02.
	프로그램명: JAVA프로그래밍 예제 4-5
*/
public class Book {
	String title;
	String author;
	void show() {System.out.println(title + " " + author); }
	
	public Book() {
		this("", "");
		System.out.println("생성자 호출됨");
	} 
	
	public Book(String title) {
		this(title, "작자미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book empthBook = new Book();
		loveStory.show();
	}

}
