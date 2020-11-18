/*
 	작성자: 20174046 채희찬
 	작성일: 2020.09.20.
	프로그램명: JAVA프로그래밍 예제 3-4
*/
public class NestedLoop {
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) {		//1단에서 9단
			for(int j=1;j<=10;j++) {	//각 단의 구구단 출력
				System.out.print(i + "*" + "=" + i*j);	//구구단 출력
				System.out.print('\t');	//하나씩 탭으로 띄기
			}
			System.out.println();		//한 단이 끝나면 다음 줄로 커서 이동
		}
	}
}
