package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: 바둑판 모양을 찍자! (┼)
		 * 문제푼날: 230616
		 * 풀이: 나
		 * 핵심: 
		 * */
		
		System.out.println("----------------------");
		for(int j=0;j<10;j++) { // 10번 반복
			
			
			for(int i=0;i<10;i++)
				System.out.print("");

			
			System.out.println();
		}
		System.out.println("----------------------");
	}

}


