package java0623;

import java.util.Scanner;

public class ex015Scanner사용하기 {

	public static void main(String[] args) {
		// Scanner : 사용자로 부터 입력을 받을 수 있는 데이터타입
		// 변수의 선언과 초기화
		
		// 1. 선언 & 초기화
		int num = 11;
		
		// 2. 선 선언, 후 초기화
		int num2;
		num2 = 100;
		
		//데이터타입 변수명 = 초기값;
		System.out.println("정수입력>>");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); //정수를 입력받는 기능
		
		System.out.println(input);
		
		// 글자입력
		System.out.println("좋아하는 과일을 입력하세요>>");
		String inputStr = sc.next();
		System.out.println(inputStr);
	}

}
