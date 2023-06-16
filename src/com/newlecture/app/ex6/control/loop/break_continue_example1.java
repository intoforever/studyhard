package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: 10~1의 숫자를 10부터 하나씩 줄어들게 6번 반복
		 * 문제푼날: 230616
		 * 풀이: 나
		 * 핵심: 맨 처음에는 10번이 출력되어야 하고 두 번째 반복될 때는 9번,
		 * 		세 번째 반복할 때는 8번 식으로 처음 10에서 1개씩 줄어들어야 한다.
		 *     1개씩 줄어들게 할 수 있는 방법은 j를 활용하면 된다. j가 1씩 늘어나고 있으니까!
		 * */
		
		System.out.println("----------------------");
		for(int j=0;j<6;j++) { // 6번 반복될 것이니까 j는 6번
			
			for(int i=0;i<(10-j);i++) // 첫번째 i는 10번이 다 출력되어야 한다. 그러니까 10을 가지고 먼저 생각! 
				System.out.printf("%d ", i+1);
			
			System.out.println();
		
		}
		System.out.println("----------------------");
	}

}


