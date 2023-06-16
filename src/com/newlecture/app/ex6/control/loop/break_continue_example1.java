package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: while문을 이용하여, 짝수마다 +가 출력되고, 홀수마다 -가 출력되는 number작성
		 * 			number의 값이 100이 되면 while문을 빠져나와 주세요. -+-+-+-+-+...(반복)
		 * 문제푼날: 230616
		 * 풀이: 나
		 * 핵심: 
		 * */
		
		
		{
			int number = 0;
			
			while(number <100) {
				
				if(number%2 == 0)
					System.out.print("+");
				else if(number%2 == 1)
					System.out.print("-");
			
			number++;
			}
			
		}
		
		
	}
}


