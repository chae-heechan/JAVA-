/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.10.02.
	���α׷���: JAVA���α׷��� ���� 4-2
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
		
		System.out.println("�簢���� ������ " + rect.getArea());
		scanner.close();
	}
	
}
