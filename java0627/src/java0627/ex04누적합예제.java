package java0627;

import java.util.Scanner;

public class ex04누적합예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Score =0;
		int Sum = 0; // 누적합 변수
		int cnt = -1; // 카운팅 변수
		do {System.out.println("숫자를 입력하세요 : ");
			Score = sc.nextInt();
			Sum = Sum+Score;//누적합 알고리즘
			cnt++; // 성적입력 횟루를 카운팅
		}
		while(Score>=0 && Score<=100) {		
			
		
		}
		System.out.println("합계 : " + (Sum-Score));
		System.out.println("평균 : " + (Sum-Score/(double)cnt));
		
	}

}
