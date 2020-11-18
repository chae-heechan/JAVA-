/*
	작성자: 20174046 채희찬
	작성일: 2020.09.15.
	프로그램명: JAVA프로그래밍 예제 2-12
*/
import java.util.Scanner;

public class Grading {
	public static void main(String args[])
	{
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();//점수 읽기
		if (score>=90)			//score가 90 이상일 때
			grade ='A';
		else if (score >=80)	//score가 90 미만 80 이상일 때
			grade ='B';
		else if (score >= 70)	//score가 80 미만 70 이상일 때
			grade = 'C';
		else if (score >=60)	//score가 70 미만 60 이상일 때
			grade = 'D';
		else					//score가 60 미만일 때
			grade = 'F';
		System.out.println("학점은 " + grade + "입니다.");
		
		scanner.close();
	}
}
