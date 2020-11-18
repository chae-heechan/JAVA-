/*
 	작성자: 20174046 채희찬
 	작성일: 2020.09.20.
	프로그램명: JAVA프로그래밍 예제 3-5
*/
import java.util.Scanner;
public class ContinueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum = 0;
		for(int i=0; i<5;i++) {
			int n =scanner.nextInt();	//키보드에 정수 입력
			if(n<=0)
				continue;	//양수가 아닌 경우 다음 반복으로 진행
			else
				sum += n;	//양수인 경우 덧셈
		}
		System.out.println("양수의 합은 " + sum);

		scanner.close();
	}
}