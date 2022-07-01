package java0701;

public class ex03ArraySumAvg {

	public static void main(String[] args) {
		// 정수형 배열 5칸을 생성하고
		// 6, 15, 45, 7, 9로 초기화하자
		
		// 배열안의 값들의 총합과 평균을 계산해보자.
		
		int[] array = {6, 15, 45, 7, 9};
		int sum = 0; // 누적합이 담길 변수
					
		for(int j = 0; j<=4; j++) {
			sum = sum + array[j];
		
		}
		
		
		System.out.println("배열 총합 : " + sum);
		System.out.println("배열 평균 : " +(double)sum/array.length); //length 말고 cnt로 해도 가능.
	}

}
