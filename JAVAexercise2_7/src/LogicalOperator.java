/*
	작성자: 20174046 채희찬
	작성일: 2020.09.14.
	프로그램명: JAVA프로그래밍 예제 2-7
*/
public class LogicalOperator {

	public static void main(String[] args) {
		//비교연산
		System.out.println('a'>'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		//비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));
	}

}
