/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.09.19.
	���α׷���: JAVA���α׷��� ���� 3-2

*/
import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		int count = 0;		//count�� �Էµ� ������ ����
		int sum = 0;	//sum�� ��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Ԏ��ϰ� �������� -1�� �з��Ͻÿ�.");
		
		int n =scanner.nextInt();	//���� �Է�
		while(n!= -1) {		//-1�� �ԷµǸ� while �� ���
			sum+=n;
			count++;
			n = scanner.nextInt();
		}
		if(count==0) System.out.println("�Էµ� ���� �����ϴ�.");
		else {
			System.out.print("������ ������ " + count + "���̸� ");
			System.out.println("����� " + (double)sum/count + "�Դϴ�.");
		}
		scanner.close();
	}

}
