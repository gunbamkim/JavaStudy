package java0624;

import java.util.Scanner;

public class ex06switch_case {

	public static void main(String[] args) {
		// switch_case 사용하기
		// 간단 챗봇 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력해주세요 : ");
		String str = sc.nextLine(); // 문자열을 입력받는 기능
				
		switch (str) {// () 안에는 변수만 들어가야함. 조건문등 X
		case "안녕":
		case "안녕하살법":
			System.out.println("안녕하세요!");
			break;
		case "배고파":
		case "오늘 점심 뭐 먹을래?":
			System.out.println("나도,. 오늘 점심은 뭐지?");
			break;

		default:
			System.out.println("무슨말인지 모르겠어.");
			break;
		}

	}

}
