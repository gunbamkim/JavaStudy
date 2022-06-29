package java0627;

import java.util.Scanner;

public class ex01자판기 {

	public static void main(String[] args) {
		System.out.println("----자판기----");
		System.out.print("금액을 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int inputmoney = sc.nextInt();

		System.out.print("메뉴를 고르세요");
		System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원)");
		
		
		// sol.1

		/*
		
		int choice = sc.nextInt();

		if (choice == 1) {
			if (inputmoney >= 800) {
				int change = inputmoney - 800;
				System.out.println("잔돈 : " + change);
			} else {
				System.out.println("잔돈이 부족합니다.");
			}
		}

		if (choice == 2) {
			if (inputmoney >= 500) {
				int change = inputmoney - 500;
				System.out.println("잔돈 : " + change);
			} else {
				System.out.println("잔돈이 부족합니다.");
			}
		}
		if (choice == 3) {
			if (inputmoney >= 1500) {
				int change = inputmoney - 1500;
				System.out.println("잔돈 : " + change);
			} else {
				System.out.println("잔돈이 부족합니다.");
			}
		}*/
		
		//so1-2
		
		int choice = sc.nextInt();
		int price = 0; // 메뉴가격을 담는 변수
		if(choice==1)
			price=800;
		if(inputmoney>=price) {
			int change = inputmoney-price;
			System.out.println("잔돈 : " + change);
		}else {System.out.println("잔돈이 부족합니다.");
		
		}
		
		if(choice ==1) {
			price=800;
		}else if(choice==2) {
			price=500;
		}else if(choice==3) {
			price=500;
		}
		
		if(inputmoney>=price) {
			int change = inputmoney - price;}
		
		
		

		/*
		 * sol.2 switch(choice) { case 1 :
		 * 
		 * 
		 * if(inputmoney>800) {
		 * 
		 * System.out.println("잔돈 : " + (inputmoney-800)); System.out.println("천원 : " +
		 * ((inputmoney-800)/1000) +"개, 오백원 : " + (((inputmoney-800)%1000)/500) +
		 * "개, 백원 : "+(((inputmoney-800)%500/100))); }else if(inputmoney<800) {
		 * 
		 * } }
		 */

	}

}
