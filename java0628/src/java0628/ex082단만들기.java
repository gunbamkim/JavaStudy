package java0628;

public class ex082단만들기 {

	public static void main(String[] args) {
		
		
		for(int a=2;a<=9;a++) {
			System.out.print(a+"단 : ");
			for(int b=1;b<=9;b++) {
			
			System.out.print(a+"*"+b+"="+(b*a)+" ");
			}
			System.out.println();
		}
	}
}
