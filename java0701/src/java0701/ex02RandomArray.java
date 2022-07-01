package java0701;

import java.util.Random;

public class ex02RandomArray {

	public static void main(String[] args) {
		// 10칸짜리 정수형 배열을 만들고
		// 1-20사이의 난수로 초기화해보자.
		
		int[] array = new int[10];
		
		Random rd= new Random(); // 난수를 생성하는 데이터타입
		int number = rd.nextInt(20)+1; 
		System.out.println(number);
		

		// 난수로 초기화하기 1.
		/*
		array[0] = rd.nextInt(20)+1;
		array[1] = rd.nextInt(20)+1;
		array[2] = rd.nextInt(20)+1;
		array[3] = rd.nextInt(20)+1;
		array[4] = rd.nextInt(20)+1;
		array[5] = rd.nextInt(20)+1;
		array[6] = rd.nextInt(20)+1;
		array[7] = rd.nextInt(20)+1;
		array[8] = rd.nextInt(20)+1;
		array[9] = rd.nextInt(20)+1;
		*/
		
		// 2.
		for(int i =0; i<=9; i++) {
			array[i] = rd.nextInt(20)+1;
		}
		
		// 배열 값 확인
		for(int i =0; i<=9; i++) {
			System.out.print(array[i]+",");
		}
		
	}

}
