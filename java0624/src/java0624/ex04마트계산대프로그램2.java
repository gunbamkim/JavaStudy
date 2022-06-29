package java0624;

import java.util.Scanner;

public class ex04마트계산대프로그램2 {

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
		
		double discount = 1.0;
		
		if(count>=11) {
			discount -= 0.1; //discount = discount-0.1;
			
		}
		
		if(count%10 ==0) {
			discount -= 0.05; //discount = discount-0.05;
			
		}
		
		System.out.println("가격은 " + (int)(count*10000*discount)+ "원 입니다.");
		
		
		
	
		
				//결과 : 가격은 0000000원입니다.
		
	}

}
