/*
	작성자: 20174046 채희찬
	작성일: 2020.09.15.
	프로그램명: JAVA프로그래밍 예제 2-14
*/
import java.util.Scanner;
public class GradingSwitch {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하시오(0~100): ");
		int score = scanner.nextInt();
		switch(score/10)
		{
		case 10:				//score = 100
		case 9:					//score는 90~99
			grade = 'A';
			break;
		case 8:					//score는 80~89
			grade = 'B';
			break;
		case 7:					//score는 70~79
			grade = 'c';
			break;
		case 6:					//score는 60~69
			grade = 'D';
			break;
		default:				//score는 59 이하
			grade = 'F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		scanner.close();
	}

}
