package java0628;

import java.util.Scanner;

public class ex03숫자감소 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		/*1.
		int s = num1>num2 ? num2 : num1;
		
		for(int i=s;i<=(num1+num2)-s;i++)
			System.out.println(i);
			*/
		
		//2.
		for(int i = num1; i<=num2; i++)
			System.out.println(i);
	}

}
