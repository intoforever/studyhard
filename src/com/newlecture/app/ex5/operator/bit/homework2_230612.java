package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class homework2_230612 {

	public static void main(String[] args) throws IOException {
//		students2.txt 파일에 저장된 학생 이름들을 읽어서 이름(성포함)의 길이가 2~3자인 이름만 students1-out.data 파일에 저장하시오.
//		단. 현재 파일에 저장된 학생의 수는 5명이고 이름의 길이가 2~3이 아닌 경우 "오류"를 출력한다.

		FileInputStream fis = new FileInputStream("res/students2.txt");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students2-out.data");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		// 여기에 코드를 작성하시오.

		for (int i = 0; i < 5; i++) {
			String name = fscan.nextLine();
			int line = name.length();
			String value = (2 <= line && line <= 3) ? name : "오류";
			if(i<4) {
				fout.println(value);
			} else {
				fout.print(value);
			}
			
			
		}

		fout.close();
		fos.close();

		fscan.close();
		fis.close();
		
		System.out.println("작업완료");
	}

}
