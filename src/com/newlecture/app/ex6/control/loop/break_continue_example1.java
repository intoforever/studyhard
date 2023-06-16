package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: 1 2 3 4 5 6 7 8 9 10의 문장을 1부터 하나씩 늘어나서 10번 반복해서 삼각형 모양으로 출력해라
		 * 문제푼날: 230616
		 * 풀이: 나
		 * 핵심: 안에 있는 밖에 있는 for2문이 반복될수록 안에 있는 for1문의 반복 횟수가 같이 늘어나야 한다
		 *     (반복횟수가 고정되어 있으면 안되는구나!) 
		 * */
		
		System.out.println("----------------------");
		for(int j=0;j<10;j++) {
			
			for(int i=0;(j+1)-i>0;i++) // 기혁님 풀이: i<=j로 하셨다. j만큼 반복되어야 하니까
				System.out.printf("%d ", i+1);
			
			System.out.println();
		
		}
		System.out.println("----------------------");
	}

}


