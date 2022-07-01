package java0701;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// 
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		int i= 0;

		for(i=0;i<=3;i++) {
			System.out.print((i+1)+"번답 >>");
			input[i] = sc.nextInt();
			
		}

		// 정답에 따라 x  o 를 출력하고 총점을 보여주는 프로그램을 만들어보자.
		// 문제 하나당 20점
	
		int[] answer= {1,4,3,2,1}; // 정답배열
		int cnt = 0;
		
		for(int j =0;j<=3;j++) {
			if(input[i] == answer[j]) {
				
				cnt++;
				System.out.println("O");
				} else {
					System.out.print("X");
				}
		
			
		
			}
		
		System.out.println("총점 : "+ (cnt*20));
	}

}
