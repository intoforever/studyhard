package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		FileOutputStream fos = new FileOutputStream("res/pic1-copy.bmp");
		
		// 코드가 1줄이면 중괄호{} 없어도 됨
		// 처음에 n에
		// main메소드까지가 전역이고 main안의 또 다른 메소드일 경우에는 지역으로 생각!
		int n = -1;
		while ((n = fis.read()) != -1)
			fos.write(n);
		
		fos.close();
		fis.close();
		
		System.out.println("작업완료");

	}

}
