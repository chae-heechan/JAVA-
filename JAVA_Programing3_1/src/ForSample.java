/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.09.19.
	���α׷���: JAVA���α׷��� ���� 3-1

*/
public class ForSample {
	public static void main(String args[]) {
		int sum = 0;
		
		for (int i=1;i<=10;i++) {	//1~10���� �ݺ�
			sum+=1;
			System.out.print(i);	//���ϴ� �� ���
			
			if(i<=9)	//1~9������ '+' ���
				System.out.print("+");
			else {
				System.out.print("=");	//'+' ����ϰ�
				System.out.print(sum);	//���� ��� ���
			}
		}
	}
}
