package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: (심화)바둑판 모양을 찍자! (┼) 단, 맨 윗줄에는 (┬)을 맨 아랫줄에는 (┴)을 찍자
		 * 문제푼날: 230616
		 * 풀이: 나
		 * 핵심: 안에 반복문에서 반복되는 것이기 때문에 for2문의 index가 아니라 for1문의 index를 사용해야 한다.
		 * */
		
		
		for(int j=0;j<12;j++) { // 10번 반복
			
			
			for(int i=0;i<10;i++) {

				if(j==0)
					System.out.print("┬");
				else if(j==11)
					System.out.print("┴");
				else
					System.out.print("┼");
			
			}
			System.out.println();
		}
		
		
		
	}

}


