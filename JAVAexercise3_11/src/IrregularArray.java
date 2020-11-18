/*
 	작성자: 20174046 채희찬
 	작성일: 2020.09.21.
	프로그램명: JAVA프로그래밍 예제 3-11
*/
public class IrregularArray {
	public static void main(String args[]) {
		int intArray[][] = new int [4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for(int i=0;i<intArray.length;i++)
			for(int j=0; j<intArray[i].length;j++)
				intArray[i][j] = (i+1)*10 + j;
		
		for(int i = 0; i < intArray.length;i++) {
			for(int j = 0; j < intArray[i].length;j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();
		}
	}
}
