package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import javax.naming.ldap.HasControls;
import javax.print.attribute.HashPrintJobAttributeSet;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class ForTestProgram {

	public static void main(String[] args) throws IOException {

		// 문제 1 for문을 이용해서 다음처럼 1을 10번 출력하는 코드를 작성하시오.
//		for (int i = 0; i < 10; i++)
//			System.out.printf("%d ", 1);
//
//		System.out.println();
//
//		// 문제 2 for문을 이용해서 다음처럼 1부터 10까지 출력하는 코드를 작성하시오.
//		for (int i = 0; i < 10; i++)
//			System.out.printf("%d ", i + 1);
//
//		System.out.println();
//
//		// 문제 3 for문을 이용해서 다음처럼 10부터 1까지 출력하는 코드를 작성하시오.
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%d ", 10 - i);
//		}
//
//		System.out.println();
//
//		// 문제 4 for문을 이용해서 다음처럼 3부터 7까지 5개의 숫자를 출력하는 코드를 작성하시오
//		for (int i = 0; i < 5; i++) {
//			System.out.printf("%d ", i + 3);
//		}
//
//		System.out.println();
//
//		// 문제 5 for문을 이용해서 다음처럼 1부터 9까지 5개의 숫자를 출력하는 코드를 작성하시오
//		for (int i = 0; i < 5; i++) {
//			System.out.printf("%d ", i + (i + 1));
//		}
//
//		System.out.println();
//
//		for (int i = 0, n = 1; i < 5; i++, n += 2)
//			System.out.printf("%d ", n);

//			이렇게 해도 m이 2씩 증가되나 이렇게 되면 횟수가 10번이 되어야 함
//			System.out.printf("%d", ++m);

//		System.out.println();
//
//		// 문제 6 for문을 이용해서 다음처럼 10개의 숫자를 출력하는 코드를 작성하시오.
//		for (int i = 0, n = 1; i < 10; i++, n += 4) {
//			System.out.printf("%d ", n + 5);
//		}
//
//		System.out.println();
//
//		// 문제
//		// 등차수열의 일반항: an = a1+(n-1)d 여기서 n은 횟수, d는 등차(n-a)
//		for (int i = 0, n = 1, an = 6; i < 10; i++, n++, an = 6 + (n - 1) * 4)
////		for(int i=0, n=1, an=6; i<10; i++, n++, an=4*n+2)
//			System.out.printf("%d ", an);
//
//		System.out.println();
//
//		// break와 continue 문제0
//		// exam.list 파일에서 모든 성적을 읽어서 다음처럼 화면에 출력하시오.
//
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

		
//		// 파일을 읽어서 5번째 까지만 출력하시오.
//		for(int i=0;fscan.hasNext();i++) {
//			
//			String word = fscan.next();
//			int kor = Integer.valueOf(word);
//			if(i>=5)
//				break;
//			
//			System.out.printf("%d,", kor);
//			
//		}
		
		
//		int i = 0;
//		while (fscan.hasNext()) {
//
//			String word = fscan.next();
//			int kor = Integer.valueOf(word);
//			System.out.printf("%d,", kor);
//			
//			if (i > 5) 
//				break;
//
//			i++;
//			
//		}
		
		// 파일에서 성적을 5번부터 읽어서 다음처럼 화면에 출력하시오.
		
//		for(int i=0;fscan.hasNext();i++) {
//			int score = fscan.nextInt();
//			
//			if (i>4) 
//				continue;
//			System.out.printf("%d,", score);
//		}
		
		boolean print = false;
		for(int i=0;fscan.hasNext();i++) {
			
			String score_ = fscan.next();
			int score = Integer.parseInt(score_);
			
			if(score == 100)
				print = true;
			
			if(print) {
				System.out.printf("%d,",score);
			}
			
		}
				
		fscan.close();
		fis.close();
		}
	}

