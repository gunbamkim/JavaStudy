package java0624;

import java.util.Scanner;

public class ex04마트계산대프로그램 {

	public static void main(String[] args) {
		// 선물세트를 구매할때 얼마를 지불해야하는지
		// 계산하는 프로그램을 만들어보자.
		// 1. 선물세트의 기본 금액 10,000원
		// 2. 11개 이상 구매시 10%할인
		// 3. 10개들이로 구매를 하면 5% 추가 할인

		Scanner sc = new Scanner(System.in);
		
		System.out.print("사려는 상품 갯수를 입력하세요 : ");
		int buy = sc.nextInt();
			
		// System.out.println("가격은 " + buy*10000 +"원 입니다.");
		if(buy>=11 && buy%10==0 ) {
			System.out.println("가격은 " + (int)(buy*10000*0.85) + "원 입니다.");
		}else if(buy>=11) {
			System.out.println("가격은 " + (int)(buy*10000*0.9) + "원 입니다.");
		}else if(buy%10==0) {
			System.out.println("가격은 " + (int)(buy*10000*0.95) + "원 입니다.");
		}else {
			System.out.println("가격은 " + (int)(buy*10000) + "원 입니다.");
		}
		
		//11개 이상
		//11개 이상 &&10개 들이
		//10개 들이
		//10개이하

		
	
		//10개
		
				//결과 : 가격은 0000000원입니다.
		
	}

}
