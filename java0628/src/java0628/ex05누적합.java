package java0628;

import java.util.Scanner;

public class ex05누적합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0; //누적합이 담길 변수
		
		int a = num1>num2?num2:num1;
		for(int i = a;i<=(num1+num2)-a;i++) {
			sum+=i;
			
		}
		System.out.println(sum);
		

	}

}


//