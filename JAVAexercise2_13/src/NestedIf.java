/*
	�ۼ���: 20174046 ä����
	�ۼ���: 2020.09.15.
	���α׷���: JAVA���α׷��� ���� 2-13
*/
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�(0~100): ");
		int score = scanner.nextInt();
		
		System.out.print("�г��� �Է��Ͻÿ�(1~4): ");
		int year = scanner.nextInt();
		
		if(score >= 60)
		{
			if(year != 4)
				System.out.println("�հ�!");
			else if(score >= 70)
				System.out.println("�հ�!");
			else
				System.out.println("���հ�!");
		}
		else
			System.out.println("���հ�!");
		
		scanner.close();
	}
}
