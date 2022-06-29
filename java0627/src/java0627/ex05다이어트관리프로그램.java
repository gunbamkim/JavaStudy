package java0627;

import java.util.Scanner;

public class ex05다이어트관리프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int now = 0;
		int target = 0; 
		int cnt =1;
		int cut = 0;
		
		System.out.println("현재몸무게 : ");
		now = sc.nextInt();
		System.out.println("목표몸무게:");
		target = sc.nextInt();
		
		
		while(now>target) {//현재 몸무게가 목표몸무게보다 큰 경우
			System.out.println(cnt + "주차 감량 몸무게: ");
			cnt++;
			cut =sc.nextInt();
			now = now - cut; //현재 몸무게에서 감량한 만큼 빼기
			
		System.out.println(now + "kg 달성!! 축하합니다!");
			
			
			
		}
	}

}
