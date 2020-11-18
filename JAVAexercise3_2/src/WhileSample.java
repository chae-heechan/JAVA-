/*
 	작성자: 20174046 채희찬
 	작성일: 2020.09.19.
	프로그램명: JAVA프로그래밍 예제 3-2

*/
import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		int count = 0;		//count는 입력된 정수의 갯수
		int sum = 0;	//sum은 합
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입렫하고 마지막에 -1을 압력하시오.");
		
		int n =scanner.nextInt();	//정수 입력
		while(n!= -1) {		//-1이 입력되면 while 문 벗어남
			sum+=n;
			count++;
			n = scanner.nextInt();
		}
		if(count==0) System.out.println("입력된 수가 없습니다.");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		}
		scanner.close();
	}

}
