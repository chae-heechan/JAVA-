/*
 	작성자: 20174046 채희찬
 	작성일: 2020.09.21.
	프로그램명: JAVA프로그래밍 예제 3-7
*/
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];	//배열 생성
		
		int max = 0;	//현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0;i<intArray.length;i++) {
			intArray[i] =scanner.nextInt();	//입력받은 정수를 배열에 저장
			if(intArray[i] > max)	//intArray[i]값이 현재 가장 큰 수보다 클 경우
				max = intArray[i];	//intArray[i]를 max로 변경
		}
		System.out.print("가장 큰 수는" + max + "입니다.");
		
		scanner.close();
	}
}
