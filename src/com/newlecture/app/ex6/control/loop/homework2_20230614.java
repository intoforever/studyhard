package com.newlecture.app.ex6.control.loop;

import java.util.Iterator;
import java.util.Scanner;

public class homework2_20230614 {

	public static void main(String[] args) {
		
//		사용자로부터 정수를 입력받아 총합이 100이 넘을 때까지 반복하는 코드를 작성하세요. 출력은 다음과 같습니다. 
//		—---
//		입력 > 13
//		합 : 13
//		입력 > 55
//		합 : 68
//		입력 > 40
//		합 : 108
//		종료!
		
//		Scanner sc = new Scanner(System.in);
//		
//		int x = 0;
//		int sum = 0;
//		while (sum<101) {
//			System.out.print("입력 > ");
//			x = sc.nextInt();
//			sum += x;
//			System.out.printf("합 : %d", sum);
//
//			System.out.println();
//		}
//		
//		System.out.print("종료!");
//		sc.close();

		
//		(심화) 주어진 3개의 변수를 이용하여 다음과 같은 결과를 출력하세요. (출력 숫자는 10개입니다.)
//		----------		
//		(주어진 변수)
//		int x = 1;
//		int y = 0;
//		int z= 	0;
//				
//		(결과값)
//		1
//		1
//		2
//		3
//		5
//		8
//		13
//		21
//		34
//		55
		
		int x = 1;
		int y = 0;
		int z= 	0;
		for(int i=0;i<10;i++) { 
			y+=x;
			System.out.println(x);
			
		}
				
		
		
		


	}

}
