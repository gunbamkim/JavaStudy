package java0623;

import java.util.Scanner;

public class ex06시급계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("노동시간을 입력하세요 : ");
		int time = sc.nextInt();

		int C = time > 8 ? (time * 5000) + ((time - 8) * 2500) : time * 5000;

		System.out.println("총 임금은 " + C + "원 입니다");
		
		// 다른풀이
		// int base = 5000; 
		// double m = 1.5;
		// double money= time>8 ? (8*base) + (time-8)*base*m : base*time;
		
	
	}

}
