package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: exam.list 파일에서 성적을 5~8번째 까지만 읽어서 화면에 출력
		 * 문제푼날: 230616
		 * 풀이: 나
		 * */
		
		
		
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);
		
		for (int i=0;fscan.hasNext();i++) {
			
			String word = fscan.next();
			int kor = Integer.parseInt(word);
			
			if ((i+1)<5) // 출력하지 말아라
				continue;
			
			
			if ((i+1)>=5 && i<8) // 출력해라, 8번째 까지만
				System.out.printf("%d,",kor);
			
			
			if ((i+1)>8) {
				break;
			}
			

		}

		fscan.close();
		fis.close();

	}

}
