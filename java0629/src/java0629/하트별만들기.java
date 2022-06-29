package java0629;

public class 하트별만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int p=1;p<=1;p++) {
			System.out.print("  ");
			for(int o=1;o<=2;o++) {
				System.out.print("*");
			}
		}
		System.out.print(" ");
		
		for(int p=1;p<=1;p++) {
			System.out.print("  ");
			for(int o=1;o<=2;o++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		for(int p=1;p<=2;p++) {
			System.out.print(" ");
			for(int o=1;o<=4;o++) {
				System.out.print("*");
			}
		}
			System.out.println();
		for(int j=0,k=11;j<=5;j++,k-=2) {
			for(int i=1 ; i<=j;i++) {
				System.out.print(" ");}
			for(int i=1; i<=k; i++) {
				System.out.print("*");
					}
			System.out.println();
	}

}
}
