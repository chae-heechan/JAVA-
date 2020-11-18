/*
 	작성자: 20174046 채희찬
 	작성일: 2020.09.19.
	프로그램명: JAVA프로그래밍 예제 3-3

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
