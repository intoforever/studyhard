package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/students1.data");
		Scanner fscan = new Scanner(fis);

		FileOutputStream fos = new FileOutputStream("res/students1-out.data");
		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
		
		// .hasNext() : 다음 값이 있다면 true, 없으면 false (하나)
		// .hasNextLine() : 다음 줄이 있다면 true, 없으면 false (한 줄)
		while (fscan.hasNextLine())
		{
			String line = fscan.nextLine();
			fout.print(line);
		
			if(fscan.hasNextLine())
				fout.println();
			
		}

//			String name = line.substring(1, 3);
		
		fscan.close();
		fis.close();
		fout.close();
		fos.close();
		
		System.out.println("작업완료");
		
	}

}
