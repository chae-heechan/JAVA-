/*
 	작성자: 20174046 채희찬
 	작성일: 2020.09.19.
	프로그램명: JAVA프로그래밍 예제 3-1

*/
public class ForSample {
	public static void main(String args[]) {
		int sum = 0;
		
		for (int i=1;i<=10;i++) {	//1~10까지 반복
			sum+=1;
			System.out.print(i);	//더하는 수 출력
			
			if(i<=9)	//1~9까지는 '+' 출력
				System.out.print("+");
			else {
				System.out.print("=");	//'+' 출력하고
				System.out.print(sum);	//덧셈 결과 출력
			}
		}
	}
}
