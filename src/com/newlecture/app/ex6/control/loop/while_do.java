package com.newlecture.app.ex6.control.loop;

import java.util.Scanner;

public class while_do {

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
				
			} // for i
		}// 지역화
		
		while(true){
			Scanner scan = new Scanner(System.in);
			
			int ox = -1;
			int oy = -1;
		
			System.out.println("그만두기: -1");
			System.out.print("(x sp y): ");
		
			ox = scan.nextInt();
			if(ox == -1) {
				System.out.println("종료");
				break;
			}// if ox == -1
			oy = scan.nextInt();
			if(oy == -1) {
				System.out.println("종료");
				break;
			}// if oy == -1

			while(ox != -1 && !(1<=ox && ox<=10)) {		// ||을 했을 때는 왜 안되는지 생각해보기
			System.out.println("오목 좌표의 범위(-1 or 1~10)를 벗어났습니다.");
			System.out.println("그만두기: -1");
			System.out.print("(x sp y): ");
			
			ox = scan.nextInt();
			oy = scan.nextInt();
		
			}// while 2
		
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
			}// for i
		}// while 1
	}// main
}// class