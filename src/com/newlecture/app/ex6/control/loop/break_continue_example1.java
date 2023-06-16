package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: 1 2 3 4 5 6 7 8 9 10의 문장을 10번 반복해서 출력해라
		 * 문제푼날: 230616
		 * 풀이: 선생님 풀이
		 * 핵심: for을 2번 반복시키는 것이다.
		 * */
		
		System.out.println("----------------------");
		for(int j=0;j<10;j++) {
			
			for(int i=0;i<10;i++)
				System.out.printf("%d ", i+1);
			
			System.out.println();
		
		}
		System.out.println("----------------------");
	}

}


