/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.09.20.
	���α׷���: JAVA���α׷��� ���� 3-6
*/
import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))	//exit�� �ԷµǸ� �ݺ� ����
				break;	//while���� ���
		}
		System.out.println("�����մϴ�...�̤�");
		
		scanner.close();
	}
}
 