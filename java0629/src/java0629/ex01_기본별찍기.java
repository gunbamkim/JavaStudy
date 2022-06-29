package java0629;

public class ex01_기본별찍기 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		
		/*1.
		for(int i = 1; i<=1;i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 1; i<=2;i++) {
			System.out.print("*");
		}System.out.println();
		
		for(int i = 1; i<=3;i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 1; i<=4;i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i = 1; i<=5;i++) {
			System.out.print("*");
		}
		System.out.println();
		*/
		
		//2.
		for(int j=1;j<=5;j++) {
		
		for(int i = 1; i<=j;i++) {
			System.out.print("*");
		}
		System.out.println();
		}
				
	}

}
