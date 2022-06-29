package java0629;

public class ex03_오른쪽별찍기 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		for(int j=1;j<=5;j++) {
			for(int i=4;j<=i;i--) {
				System.out.print(" ");
			}
				
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
					
	}

}
