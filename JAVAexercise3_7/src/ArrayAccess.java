/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.09.21.
	���α׷���: JAVA���α׷��� ���� 3-7
*/
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];	//�迭 ����
		
		int max = 0;	//���� ���� ū ��
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i=0;i<intArray.length;i++) {
			intArray[i] =scanner.nextInt();	//�Է¹��� ������ �迭�� ����
			if(intArray[i] > max)	//intArray[i]���� ���� ���� ū ������ Ŭ ���
				max = intArray[i];	//intArray[i]�� max�� ����
		}
		System.out.print("���� ū ����" + max + "�Դϴ�.");
		
		scanner.close();
	}
}
