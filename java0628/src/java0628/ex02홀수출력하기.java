package java0628;

public class ex02홀수출력하기 {

	public static void main(String[] args) {
		// for문 사용해서25~70 홀수만 출력해보자!
		
		for(int num = 25;70>=num; num++) {//주로 초기화값-시작값 ; 검사조건-어디까지 돌릴건지
			if(num%2!=0 ) { // num%2 ==1
				System.out.println(num);
			}
		}
		
		//2.
		
		for(int num = 25;70>=num; num +=2) {
			System.out.println(i);
		}
	}

}


