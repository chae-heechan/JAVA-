/*
	작성자: 20174046 채희찬
	작성일: 2020.09.15.
	프로그램명: JAVA프로그래밍 예제 2-10
*/
import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		if(score >= 80)
			System.out.println("축하합니다! 합격입니다.");
		
		scanner.close();
	}
}
