package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class loopTest_230615 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);
		
		
		//100을 만나면 100을 뺀 이후의 성적을 모두 출력하시오
		
		
		for(boolean found=false;fscan.hasNext();) {
			String word = fscan.next();
			int kor = Integer.parseInt(word);
			
			if (kor == 100)
				found = true;
				
			if (!found || kor == 100) 
				continue;
			
			System.out.printf("%d,", kor);
			}
		
		
		
		
		//문제 3 파일에서 성적을 읽다가 100점을 만나면 100을 포함한 그 이후의 성적을 모두 출력하시오.
		//(100을 만나면 달라지는 상태 변수가 하나 필요하게 됨, 발견 상태가 유지 되어야 하므로)
		
//		for(boolean found=false;fscan.hasNext();) {
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//			
//			if (kor == 100)
//				found = true;
//				
//			if (!found) 
//				continue;
//			
//			System.out.printf("%d,", kor);
//			}
		
		
		
		
//		boolean print = false;
//		for(int i=0;fscan.hasNext();i++) {
//			String score_ = fscan.next();
//			int score = Integer.parseInt(score_);
//			
//			if (score == 100) {
//				print =true;
//			}
//			
//			if (print) {
//				System.out.printf("%d,",score);
//			}
//		}
		
		
		
		
		
//		for(int i=0,n=1;fscan.hasNext();i++) {
//			
//			String score_ = fscan.next();
//			int score = Integer.parseInt(score_);
//			
//			if (score == 100) {
//				n++;
//			}
//			
//			if (n>1) {
//				System.out.printf("%d,",score);
//			}
		
		fscan.close();
		fis.close();
		
	}
		
	

}
