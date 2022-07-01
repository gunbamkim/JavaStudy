package java0701;

import java.util.Random;

public class ex04OddArray {

	public static void main(String[] args) {
		// 정수형 배열을 만들어서 임의의 값으로 초기화하자.
		
		System.out.print("Array에 들어있는 홀수는 ");
		

		int[] array = new int[10];
		Random rd = new Random();

		int cnt = 0;

		for (int i = 1; i <array.length; i++) { // 범위구할때 arrat.length 써도 가능.
			array[i] = rd.nextInt(20);

			if (array[i] % 2 != 0) {
				cnt++;
				System.out.print(array[i] + ", ");

			} else {

			}

		}
		
		System.out.println("이며 총: " + cnt + "개 입니다.");

	}

}
