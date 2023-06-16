package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: (최종판)바둑판 모양을 찍자! (┼) 단, 맨 윗줄에는 (┬)을 맨 아랫줄에는 (┴)을, 양 옆에는 벽(├, ┤)을 넣자.
		 * 문제푼날: 230616
		 * 풀이: 나
		 * 핵심: 세로축 j와 가로축 i에서 변화되는 값이 무엇인지에 집중해보자.
		 * */
		
		
		
		for(int j=0;j<10;j++) { // 10번 반복
			
			
			for(int i=0;i<10;i++) {
			
				if (j == 0) {
					if (i == 0)
					System.out.print("┌") ;
					else if (i == 9)
					System.out.print("┐");
					else
					System.out.print("┬");

				} else if (j == 9) {
					if (i==0)
					 System.out.print("└");
					else if (i == 9)
						System.out.print("┘");
					else
					System.out.print("┴");
					
					
				} else if (i==0) {
					System.out.print("├");
					
				} else if (i==9){
					System.out.print("┤");
				
				} else {
					System.out.print("┼"); // 아무것도 해당되지 않으면 찍기
		
				}
		
		}
			System.out.println();
		
	}

}
}


