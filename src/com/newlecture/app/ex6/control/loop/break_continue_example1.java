package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: if와 if~else if ~ else if ~ else일 때
		 * 문제푼날: 230616
		 * 풀이: 선생님
		 * 핵심: 3가지는 정확하게 무슨 차이일까?
		 * */
		
		System.out.println("----------------------");
		for(int j=0;j<10;j++) { // 10번 반복
			
			for(int i=0;i<10;i++) { // 10번 반복 
				
//				if(i==5 || i==9)					// 조건에 해당될 때 "b"를 추가로 실행해준다. (i가 5번때랑 9번때 2번 추가 실행) 1 2 3 4 b 6 7 8 b 10
//					System.out.print("b ");
				
				if(i==2)
					System.out.print("a "); // 조건에 해당될 때 "a"를 추가로 실행하니까 더해짐 (else없으면 총 110번 실행이 되는 것)\
				else if(i==5)
					System.out.print("b ");
				else if(i==9)
					System.out.print("c ");
				else						// 그런데 else가 있으면 나머지 경우로 조건을 제한시켜주니까 (else가 있어서 총 100번 실행)
					System.out.printf("%d ", i+1);
		
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}

}


