package java0628;

import java.util.Scanner;

public class ex06삼육구 {

	public static void main(String[] args) {
		
		for(int i =1;i<50;i++) {
			if(i%10==3 || i%10==6 ||i%10==9) {//박수
			System.out.println("박수");
			}else if(i%10==5) {
				System.out.println("으악");	
			}else {// 일반숫자가 나오는경우
			System.out.println(i);
			}
			
		}

	}
}


