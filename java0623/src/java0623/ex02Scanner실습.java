package java0623;

import java.util.Scanner;

public class ex02Scanner실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Java 점수 입력 : ");
		int JavaScore = sc.nextInt();

		System.out.print("Web 점수 입력 : ");
		int WebScore = sc.nextInt();

		System.out.print("Android 점수 입력 : ");
		int AndScore = sc.nextInt();

		int sumScore = JavaScore + WebScore + AndScore;

		System.out.println("총합 : " + sumScore);
		System.out.println("평균 : " + sumScore / 3.0f);
	}
}
