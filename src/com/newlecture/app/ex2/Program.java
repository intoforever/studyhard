package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Program {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("res/data1.txt");
		// PrintStream fout = new PrintStream(fos, true, "UTF-8");
		PrintWriter fout2 = new PrintWriter(fos, true, Charset.forName("UTF-8"));

		fout2.print("Hello" + "\n");
		fout2.print(192827094942L + "\n");
		fout2.print("안녕하세요 ㅎ2");
		System.out.print("Hello" + "\n");
		System.out.print(192827094942L + "\n");
		System.out.print("안녕하세요 ㅎ2");

		fout2.close();
		fos.close();

	}

}
