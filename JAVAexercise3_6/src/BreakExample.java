/*
 	작성자: 20174046 채희찬
 	작성일: 2020.09.20.
	프로그램명: JAVA프로그래밍 예제 3-6
*/
import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))	//exit이 입력되면 반복 종료
				break;	//while문을 벗어남
		}
		System.out.println("종료합니다...ㅜㅜ");
		
		scanner.close();
	}
}
 