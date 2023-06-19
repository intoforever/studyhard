package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: 시스템창에 입력값을 받아서 다음과 같이 출력하시오
		 * 	    *
		 * 	   ***
		 * 	  *****
		 * 	 *******
		 * 	  *****
		 * 	   ***
		 * 	    *   
		 * 문제푼날: 230616
		 * 풀이: 나
		 * 핵심: 줄어드는 값과 고정된 값이 무엇인지 구분한다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println("값을 입력하세요.");
		
		
		//별이 13531로 끝나는 것을 예시로 만들어 보자. input을 1로 하겠다.
		for (int i=0; i < 2*input; i++) {
			
			
			
			//뭔가 공백출력되고 증가 된 것이 1줄이고 그 다음 줄은 개행이 되어서 들어가야 하는데,
			//지금 거기를 못풀고 있음
			
			
			//앞에 공백 출력 (감소)
			for(int j=0;j<(1-i);j++) 
				System.out.print(" ");
			
			//뒤에 별 출력 (증가)
			for(int k=0; k<1+(2*i); k++)
				System.out.print("*");
		
		//행 나누기
		System.out.println("");
		
		
		System.out.println("");
			
			//밑에 공백 출력 (증가)
			for(int j=0; j<(i+1); j++)
				System.out.print(" ");
			
			//밑에 별 출력 (감소)
			for(int j=0; j<3-(2*i);j++)
				System.out.print("*");
			
			
		}//for i
			
			
		sc.close();

	}//main
}//class
