/*
 	작성자: 20174046 채희찬
 	작성일: 2020.10.02.
	프로그램명: JAVA프로그래밍 예제 4-2
*/
import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}
	
}
