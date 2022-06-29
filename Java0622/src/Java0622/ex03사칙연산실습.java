package Java0622;

public class ex03사칙연산실습 {
	// 프로그램의 시작점
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 몫
		System.out.println(a%b); // 나머지

		float num1 = 3.14f;
		float num2 = 16.999f;
		
		System.out.println(a + num1); // a -> float 자동형변환
		System.out.println(a - num2);
		
		// char는 1개 글자만 담을 수 있어서 불편하다.
		// 여러 글자를 사용할때는 string 타입을 사용하자.
		
		char c = '안';
		String str = "안녕하세요";  // * String S 대문자 조심.
		String num3 = "100";  
		
		System.out.println(a + num3); //int -> String로 자동형변환

		
		
	
		
	}
}
