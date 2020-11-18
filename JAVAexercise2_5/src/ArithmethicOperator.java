/*
	작성자: 20174046 채희찬
	작성일: 2020.09.14.
	프로그램명: JAVA프로그래밍 예제 2-5
*/
import java.util.Scanner;

public class ArithmethicOperator {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int time = scanner.nextInt();	//정수입력
		int second = time % 60;			//60으로 나눈 나머지는 초
		int minute = (time / 60) % 60;	//60으로 나는 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60;	//60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute +"분, ");
		System.out.print(second + "초입니다.");
		
		scanner.close();
	}
}
