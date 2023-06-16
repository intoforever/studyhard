package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);

		for (int count = 0; fscan.hasNext();) {
			String word = fscan.next();
			int kor = Integer.parseInt(word);

			if (kor == 100)
				count++;

			if (count < 2 || kor == 100)
				continue;

			System.out.printf("d,", kor);

		}

		fscan.close();
		fis.close();

	}

}
