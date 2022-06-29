package java0629;

public class ex05_약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=2; i<=30; i++) {
				System.out.print(i + "의 약수 :");
				for(int j =1; j<=i; j++) {
					if(i%j==0) { // **중요: 약수구할때는 나머지가 0으로 떨어지는것들임에 주의!**
						System.out.print(j+ " ");
						}
					
					}
				System.out.println();
			}
	}

}
