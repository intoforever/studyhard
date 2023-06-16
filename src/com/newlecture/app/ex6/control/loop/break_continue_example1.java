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
		 * 풀이: 선생님
		 * 핵심: continue~break는 a~z사이의 수만 구할 때 요긴하게 쓸 수 있따!
		 * */
		
		
		
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);
		
		for (int i=0;fscan.hasNext();i++) {
			
			String word = fscan.next();
			int kor = Integer.parseInt(word);
			
			if (i<4) // 0, 1, 2, 3, 4 출력하지 말아라
				continue;
			
			if (i==8) // 8번째 부터는 더 이상 계산하지 말아라
				break;
			
			System.out.printf("%d,",kor); // 출력해라, 5~8번째 까지만
			
			
			}
			
		fscan.close();
		fis.close();

		}


	}


