package com.newlecture.app.prorammers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/students3.data");
		Scanner fscan = new Scanner(fis);
		
		FileOutputStream fos = new FileOutputStream("res/students3-out.data");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
		
		while (fscan.hasNextLine()) {
			String line = fscan.nextLine();
			fout.print(line);
			
			if (fscan.hasNextLine()) {
				fout.println();
			}
		}
		
		
		fout.close();
		fos.close();
		
		fscan.close();
		fis.close();
		
		System.out.println("작업완료");
	}

}
