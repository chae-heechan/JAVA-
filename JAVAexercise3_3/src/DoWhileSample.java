/*
 	�ۼ���: 20174046 ä����
 	�ۼ���: 2020.09.19.
	���α׷���: JAVA���α׷��� ���� 3-3

*/
public class DoWhileSample {

	public static void main(String[] args) {
		char c='a';
		
		do {
			System.out.print(c);
			c=(char)(c+1);
		}while(c<='z');
	}
}
