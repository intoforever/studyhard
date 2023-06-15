package com.newlecture.app.ex4.text.copy;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class test_230612 {

	public static void main(String[] args) throws IOException {

		// 여기에 코드를 작성하시오.
		FileInputStream fis = new FileInputStream("res/students1.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students1-out.data");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		/*
		 * 변수를 하나 선언해서 공유할 수 있도록 한다. String line = null; String name = null;
		 */

		/*
		 * 중괄호를 해주면 지역변수가 된다. 같은 이름의 변수를 여러번 쓸 수 있게 된다. { String line =
		 * fscan.nextLine(); String name = line.substring(1,line.length());
		 * fout.println(name); }
		 * 
		 * 이 지역 밖을 벗어나면 변수를 사용할 수가 없다.
		 */

		System.out.println("---------------------------------");
		String line = fscan.nextLine();
		String name = null;

		/*
		 * for (int i = 0; i < 5; i++) { name = line.substring(1); String nameError =
		 * (name.length() <= 2) ? name : "이름이 2글자 입니다."; fout.println(nameError); line =
		 * fscan.nextLine(); }
		 */

		fout.close();
		fos.close();

		fscan.close();
		fis.close();

		System.out.println("작업완료");
	}
}
