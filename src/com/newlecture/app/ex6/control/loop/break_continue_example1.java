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
		 * 문제: 다음과 같이 출력하시오
		 * 		     *
		 * 		    **
		 * 		   ***
		 * 		  ****
		 * 		 *****
		 * 문제푼날: 230616
		 * 풀이: 나
		 * 핵심: 줄어드는 값과 고정된 값이 무엇인지 구분한다.
		 * */
		
		{
		String star_ = "*";
		String star = "";
		for(int i=0;i<5;i++) {
			for(int j=0;j<(5-i);j++) {
				if(j<(5-(i+1))) {
					System.out.print(" ");
				} else {
					star +=star_;
					System.out.printf(star);
				}
			}//for j
		 
		System.out.println();	
		}//for i
		}//지역화
	}//main
}//class

