package Java0622;

public class ex05시분초_변환기 {
		public static void main(String[] args) {
			// 정수형 변수에 초를 초기화
			int second = 3723;
					
			// 초단위의 값을 시/분/초 형태로 변환하기
			// 결과값 : 0시 0분 0초
					
			//코드 작성
			//1.
			System.out.println((second / 60) / 60 + "시" + (second / 60) % 60 + "분" + (second % 60) + "초");
			
			//2.
			int h = second / 3600;
			int m = second % 3600 / 60;
			int s = second % 60;
			
			System.out.println(h + "시" + m + "분" + s + "초");
			
			
		}
}
