/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.09.21.
	���α׷���: JAVA���α׷��� ���� 3-8
*/
import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];	//�迭�� ����� ����
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��Ͻÿ�>>");
		for(int i = 0;i <intArray.length;i++)
			intArray[i] = scanner.nextInt();	//Ű���忡�� �Է¹��� ���� ����
		
		for(int i=0;i<intArray.length;i++)
			sum += intArray[i];	//�迭�� ����� ���� ���� ���ϱ�
		
		System.out.print("����� " + (double)sum/intArray.length);
		scanner.close();
	}
}
