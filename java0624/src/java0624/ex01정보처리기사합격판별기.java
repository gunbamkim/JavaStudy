package java0624;

import java.util.Scanner;

public class ex01정보처리기사합격판별기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("DB : ");
		int DB = sc.nextInt();
		
		System.out.print("전자계산기 구조 :");
		int Cal = sc.nextInt();
			
		System.out.print("OS : ");
		int OS = sc.nextInt();
				
		System.out.print("데이터통신 : ");
		int DA = sc.nextInt();
		
		System.out.print("소프트웨어공학 : ");
		int Soft = sc.nextInt();
		
		int sub = DB + Cal + OS + DA +Soft;
		
		
		if(DB >= 8 && OS >= 8 && DA>=8 && Soft>=8 && Cal >= 8 && sub>=60 ) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("불합격입니다!");
		
		}
	}

}
