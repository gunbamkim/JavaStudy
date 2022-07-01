package java0701;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// 5개의 문제에 대한 답을 입력을 받고
		// 입력받은 값을 출력해보자.
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		

		for(int i=0;i<=4;i++) {
			System.out.print((i+1)+"번답 >>");
			input[i] = sc.nextInt();
			
		}
		
		System.out.print("입력한 답은 : ");
		

		for(int i=0;i<=4;i++) {
		System.out.print(input[i] + " ");
		}
	}

}
