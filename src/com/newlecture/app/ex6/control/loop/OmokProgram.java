package com.newlecture.app.ex6.control.loop;

public class OmokProgram {

	public static void main(String[] args) {
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
				else if ((i >= j - 2) && (i <= 8 - j))		//부등호: 해당되는 영역
					System.out.print("●");
				else if ( (i == j - 2) || (i == 8 - j))		//등호: 해당되는 값(선)
					System.out.print("●");
				else
					System.out.print("┼");

			System.out.println();
		} // for j

	}// main
}// class