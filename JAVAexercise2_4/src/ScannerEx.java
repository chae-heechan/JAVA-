/*
	�ۼ���: 20174046 ä����
	�ۼ���: 2020.09.14.
	���α׷���: JAVA���α׷��� ���� 2-4
*/
import java.util.Scanner;		//scanner ����ϱ� ���� import

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next();
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble();
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean issingle = scanner.nextBoolean();
		System.out.println("���� ���δ� " + issingle + "�Դϴ�.");
		
		scanner.close();		//scanner �ݱ�
	}
}
