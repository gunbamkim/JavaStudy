package Java0622;

public class ex01형변환 {
		// 프로그램의 시작점
	public static void main(String[] args) {
		// 형변환 (casting)
				// 변수를 다른 데이터타입으로 변경하는 행위
				// bite -> short, int -> double
				// char -> int
				
				// 자동형변환 : 데이터타입이 자동으로 변경되는 것
				short s = 10;
				int i = s;
				// 강제형변환 : 명시적으로 변경할 데이터타입을 작성해서 강제로 변환하는 것
				long l = 100;
				int i2 = (int) l; // 데이터손실이 발생할수도 있음
				
				// char 형변환
				char c = 'a';
				int i3 = c;
				
				System.out.println(i3);
				System.out.println((char)(c+1)); //값만 복사해서 사용
				
				c++; // ++은 무조건 1추가 // 값을 아예 변경
				System.out.println(c);
				
				c = (char)(c+1);
				System.out.println(c);
				
				
	}
	

}
