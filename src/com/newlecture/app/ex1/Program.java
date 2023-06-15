package com.newlecture.app.ex1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		// 열기
		// 이때 res라는 폴더는 꼭 미리 만들어 두기, 폴더를 생성해주는 기능은 없음
		FileOutputStream fout = new FileOutputStream("res/data.txt");

		fout.write(40);
		fout.write(65);
		fout.write(100);
		fout.write('9');
		fout.flush();

		// 닫기
		fout.close();

		char st = 'A'; // 9의 코드값을 알 수 있음, 그래서 9의 코드값을 외울 필요가 없음, 
		System.out.println(st+1);
		System.out.println(st+2);
		System.out.println(st+3);
		System.out.println(st+4);
		
	}

}
