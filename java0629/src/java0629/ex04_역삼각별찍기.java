package java0629;

public class ex04_역삼각별찍기 {

	public static void main(String[] args) {
		// *********
		//  ******* 
		//   *****
		//    ***
		//     * 
		
		
		
		
		for(int j=0,k=9;j<=4;j++,k-=2) {
			for(int i=1 ; i<=j;i++) {
				System.out.print(" ");}
			for(int i=1; i<=k; i++) {
				System.out.print("*");
					}
			
			System.out.println();
		}
		
		/*
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print(" ");
			}
				
			for(int i=9;i>=1;i--) {
				System.out.print("*");
			}
			System.out.println();
		*/
		}


}
