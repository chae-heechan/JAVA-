/*
	�ۼ���: 20174046 ä����
	�ۼ���: 2020.09.15.
	���α׷���: JAVA���α׷��� ���� 2-14
*/
import java.util.Scanner;
public class GradingSwitch {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է��Ͻÿ�(0~100): ");
		int score = scanner.nextInt();
		switch(score/10)
		{
		case 10:				//score = 100
		case 9:					//score�� 90~99
			grade = 'A';
			break;
		case 8:					//score�� 80~89
			grade = 'B';
			break;
		case 7:					//score�� 70~79
			grade = 'c';
			break;
		case 6:					//score�� 60~69
			grade = 'D';
			break;
		default:				//score�� 59 ����
			grade = 'F';
		}
		System.out.println("������ " + grade + "�Դϴ�.");
		scanner.close();
	}

}