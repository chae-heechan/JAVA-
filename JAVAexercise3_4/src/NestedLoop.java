/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.09.20.
	���α׷���: JAVA���α׷��� ���� 3-4
*/
public class NestedLoop {
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {		//1�ܿ��� 9��
			for(int j=1;j<=10;j++) {	//�� ���� ������ ���
				System.out.print(i + "*" + "=" + i*j);	//������ ���
				System.out.print('\t');	//�ϳ��� ������ ���
			}
			System.out.println();		//�� ���� ������ ���� �ٷ� Ŀ�� �̵�
		}
	}
}
