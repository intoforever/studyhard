package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// 자료형
		int kor1, kor2, kor3, kor4, kor5, kor6;
		int total;
		float avg;

		// 성적 입력
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		FileInputStream fis = new FileInputStream("res/exam.txt");
		Scanner fscan = new Scanner(fis);
		
		
//		kor1 = fis.read();
//		kor2 = fis.read();
//		kor3 = fis.read();
	
		
//		kor1 = fscan.nextInt(); // 바로 정수로 읽어오지 않고
		
		fscan.nextLine();
		
		String kor1_ = fscan.next(); // "30"
		kor1 = Integer.parseInt(kor1_); //"30" -> 30
		System.out.println(kor1);
		String kor2_ = fscan.next();
		kor2 = Integer.parseInt(kor2_);
		System.out.println(kor2);
		String kor3_ = fscan.next();
		kor3 = Integer.parseInt(kor3_);
		System.out.println(kor3);
				
				
		fscan.close();
		fis.close();
		
		
		
//		int ch = fis.read();
//		System.out.println(ch);

//		kor4 = 100;
//		kor5 = 70;
//		kor6 = 50;

		// 성적 출력
		total = kor1 + kor2 + kor3;
		avg = total / 3;

		
		// 성적 저장
		FileOutputStream kos = new FileOutputStream("res/exam-out.txt");
//		PrintStream kout = new PrintStream(kos, true, "UTF-8");
		PrintWriter kout2 = new PrintWriter(kos, true, Charset.forName("UTF-8"));

		
		// 바이너리로 출력됨
//		kout2.write(kor1);
//		kout2.write(kor2);
//		kout2.write(kor3);

		// 아스키코드로 출력됨
//		kout2.print(kor1);
//		kout2.print(kor2);
//		kout2.print(kor3);

		// 원하는 형식에 맞춰서 출력됨
		// c, s, d(xㅣo), f(e)
//		kout2.printf("%10d,%-10d,%6.2f\n",kor1,kor2,2.30293);
//		kout2.printf("%d,%d,%d\n",kor4,kor5,kor6);
		kout2.printf("total is %d\n", total);
		kout2.printf("avg is %5.2f\n", avg);

//		kout.close();
		kout2.close();
		kos.close();
		
		System.out.println("작업완료");
		
	}

}
