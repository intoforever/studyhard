package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		
		{
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++)

					if (i == 0 && j == 0)
						System.out.print("┌");
					else if (i == 0 && j == 11)
						System.out.print("┐");
					else if (i == 11 && j == 0)
						System.out.print("└");
					else if (i == 11 && j == 11)
						System.out.print("┘");
					else if (j == 0)
						System.out.print("├");
					else if (j == 11)
						System.out.print("┤");
					else if (i == 0)
						System.out.printf("┬");
					else if (i == 11)
						System.out.print("┴");
					else
						System.out.print("┼");

				System.out.println();
				
			} // for j
		}// 지역화
		
		
		{
			int ox = -1;
			int oy = -1;
			boolean oxquit = false;
			while (!oxquit) {
			System.out.println("그만두기: -1");
			System.out.print("(x sp y): ");
			
			Scanner scan = new Scanner(System.in);
			ox = scan.nextInt();
			oy = scan.nextInt();
			
			if(ox == -1 && !scan.hasNext()) { 			//ox값이 -1이면서 다음값이 없으면
				oxquit = true;										//oxquit을 true로 바꾸고 반복 종료.
				System.out.println("종료");
				break;
			} else {
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 12; j++)

					if (i == 0 && j == 0)
						System.out.print("┌");
					else if (i == 0 && j == 11)
						System.out.print("┐");
					else if (i == 11 && j == 0)
						System.out.print("└");
					else if (i == 11 && j == 11)
						System.out.print("┘");
					else if(ox==j && oy == i)
						System.out.print("○");
					else if (j == 0)
						System.out.print("├");
					else if (j == 11)
						System.out.print("┤");
					else if (i == 0)
						System.out.printf("┬");
					else if (i == 11)
						System.out.print("┴");
					else
						System.out.print("┼");
				System.out.println();
			}// if

			} // for j
			}//while
		} // 지역화
	}// main
}// class