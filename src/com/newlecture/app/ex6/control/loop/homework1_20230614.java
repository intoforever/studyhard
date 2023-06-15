package com.newlecture.app.ex6.control.loop;

import java.awt.desktop.PrintFilesEvent;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Scanner;

public class homework1_20230614 {

	public static void main(String[] args) {

		// 1번 시험 점수를 입력받아서 성적을 출력하세요
//		Scanner fscan = new Scanner(System.in);
//		
//		System.out.println("시험 점수를 입력하세요(0~100점)");
//		
//		int score = fscan.nextInt();
//		String grade = "";
//		
//		if (score<60) {
//			grade = "F";
//		} else if(60<=score && score <=69) {
//			grade = "D";
//		} else if (70<=score && score <=79) {
//			grade = "C";
//		} else if (80<=score && score <=89) {
//			grade = "B";
//		} else {
//			grade = "A";
//		}
//			System.out.printf("당신의 이번 학기 성적은 %s 입니다.\n", grade);
//		
//		fscan.close();

		// 2번 1에서 100사이의 홀수 갯수를 출력하세요

//		int count = 0;
//		for (int i = 0; i < 100; i++) {
//			if (i % 2 == 1) {
//				count = count + 1;
//			}
//		}
//		System.out.println(count);

		// 3번 1!+2!+3!+4!+5!의 결과를 구하세요.

//		int result = 1;
//		int x = 0;
//		for (int i = 0, n = 1; i < 5; i++, n++) {
//			result = result * n;
//			x += result;
//
//		}
//		System.out.println(x);

//			n이 1일 때		1*1			1*result = 1
//			n이 2일 때		2*1			2*result = 2
//			n이 3일 때		3*2*1		3*result = 6
//			n이 4일 때		4*3*2*1		4*result = 24
//			n이 5일 때		5*4*3*2*1	5*result = 120
//				
//			그래서 result가 처음에 1로 선언이 되어야 하고,
//			result의 값이 계속해서 더해져서 들어와야 한다.

//		int i=2;
//		int n=3;
//		int an = n*(n-i);
//		an=an;
//		an = (n*an);
//		System.out.println(an);

		// 4번 66을 소인수분해 하세요
		// 인수: n을 2~(n-1) 값들로 나눴을 때 나머지가 0이 아닌 것
		
		// 2를 1로 나누면 나머지가 0이 되는데
		// 3을 2로 나누면 몫이 1 나머지가 1
		// 4를 2로 나누면 몫이 2 나머지가 0, 3으로 나누면 몫이 1 나머지가 1
		// 5를 2로 나누면 몫이 2 나머지가 1, 3으로 나누면 몫이 1 나머지가 2, 4로 나누면 몫이 1 나머지가 1
		// 6을 2로 나누면 나머지가 3, 3으로 나누면 나머지가 2, 4로 나누면 나머지가 2, 5로 나누면 나머지가 1
		
//		int num = 66;
//		int value = 0;
//		for(int i=0,n=1; i<num; i++, n++) {
//			
//			if ( ( (n+2)/(i+2)==0) && (num%(n+1)==0) ) {
//				value=n;
//				System.out.printf("%d,",value);
//				
				
			
			
			
//			int chk = (1<=(num/(n+1))&&)?n:0;
//			value=chk;
//			System.out.printf("%d,", value);
		
		

		// -----------------여기까지가 main-----------------//
		
	}
}

