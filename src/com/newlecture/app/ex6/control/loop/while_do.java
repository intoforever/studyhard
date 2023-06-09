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
		
			do
			{
				System.out.println("그만두기: -1 0");
				System.out.print("(x sp y): ");
		
				ox = scan.nextInt();
				oy = scan.nextInt();
				
				if(ox == -1) {
					System.out.println("안녕~");
					return;																//break이면 do~while문 안에 갇혀버리기 때문에 return으로 강제 종료한다.
				}
			
				if(!((1<=ox && ox<=10) && (1<=oy && oy<=10)))
					System.out.println("오목 좌표의 범위(-1 or 1~10)를 벗어났습니다.");	 //while(true)문 안에서 반복되어야 하지만 조건이 달성되어야만 돌아거라서 조건을 따로 한 번 더 걸어줬다.
				
			} while(!((1<=ox && ox<=10) && (1<=oy && oy<=10)));		// ||을 했을 때는 왜 안되는지 생각해보기 //오목조건에 맞아야 한다는 뜻이다.
		
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
						else if(ox==j && oy==i)
							System.out.print("●");
						else
							System.out.print("┼");
					
					System.out.println();
			}// for i
		}// while 1
	}// main
}// class
