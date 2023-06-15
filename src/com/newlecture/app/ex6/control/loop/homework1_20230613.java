package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

import javax.xml.validation.Validator;

import org.w3c.dom.ls.LSOutput;

public class homework1_20230613 {

	public static void main(String[] args) {

		/*--------------------------------------------------------------
		System.out.println("----------------------------------------");
		System.out.println("1번: ?에 들어갈 코드를 작성하세요. (x와 ++만 사용)");
		int x = 1;
		System.out.println(++x); // 2
		System.out.println(x++); // 2
		System.out.println(x); // 3
		System.out.println("----------------------------------------");
		--------------------------------------------------------------*/

		/*--------------------------------------------------------------
		 * 오늘 배운 연산자를 자유롭게 모두 사용해보세요 (+, -, *, /, %, <=, && 등등) boolean isLLessThan3 =
		 * (1+) <3; System.out.println(isLessThan3);
		 --------------------------------------------------------------*/

		
		 System.out.println("2번: Scanner를 이용해 사용자에게 입력받은 값이 5보다 크고 10보다 작을 때 출력하는 코드를 작성하세요");
		 System.out.println("----------------------------------------");
		 
		 Scanner sc = new Scanner(System.in);
		 int val = sc.nextInt();
		 
		 System.out.println(( (5<val) && (val<10) )?val:0);		 
		 
		 
//		 if ((5 < val) && (val < 10)) {
//		 System.out.println(val); }
//		 sc.close();
		 
		 
		 
		 System.out.println("----------------------------------------");
		

		/*--------------------------------------------------------------
		 * System.out.println("3번: 사용자에게 입력받은 값이 2 또는 3의 배수인 수일 때, 출력하는 코드를 작성하세요");
		 * System.out.println("----------------------------------------");
		 * Scanner sc = new Scanner(System.in); String val_ = sc.nextLine();
		 * int val = Integer.valueOf(val_);
		 * if (val % 6 == 0) {
		 * System.out.println("입력값 " + val + " 은 6의 배수입니다.");
		 *  } else if (val % 3 == 0){
		 *  System.out.println("입력값 " + val + " 은 3의 배수입니다.");
		 *  } else if (val % 2 == 0) {
		 *  System.out.println("입력값 " + val + " 은 2의 배수입니다.");
		 * 	}
		 * sc.close();
		 * System.out.println("----------------------------------------");
		 --------------------------------------------------------------*/

		/*--------------------------------------------------------------
		 * System.out.println("4번: 삼항 연산자를 이용하여 x+y가 홀수라면 변수 isOdd에 true를 할당하는 코드를 작성하세요");
		 * Scanner sc = new Scanner(System.in); String x_ = sc.nextLine();
		 * int x = Integer.valueOf(x_);
		 * String y_ = sc.nextLine();
		 * int y = Integer.valueOf(y_);
		 * boolean isOdd = ((x+y)%2 == 1)?true:false;
		 * System.out.println("홀수이면 true, 짝수이면 false 입니다." + isOdd);
		 --------------------------------------------------------------*/

		
//		 int a = 0;
//		 for(int i=0;i<=10;i++) {
//			 a = a+i; // 대입	
//		 }
//		 System.out.println(a);
		 
		

		/*
		 * for(int i=1;i<11;i++) { if(i%2 == 0); System.out.println(i); }
		 * 
		 * 
		 * for (int i=10;i>0;i--) { if (i%2 == 1); System.out.println(i);
		 * 
		 * }
		 */

//		int i = 0;
//		while (i < 10) {
//			i++;
//			System.out.println(i);
//		}

		int i = 0;
		while (i < 101) {
			i++;
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
	}
}


