package com.newlecture.app.ex6.control.loop;

import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class break_continue_example1 {

	public static void main(String[] args) throws IOException {

		/* 
		 * 문제: 1~10의 숫자를 1부터 하나씩 늘어나게 10번 반복해서 삼각형 모양으로 출력해라
		 * 문제푼날: 230616
		 * 풀이: 나는 못풀었고 ㅠㅠ 선생님풀이
		 * 핵심: 안에 있는 밖에 있는 for2문이 반복될수록 안에 있는 for1문의 반복 횟수가 같이 늘어나야 한다
		 *     (반복횟수가 고정되어 있으면 안되는구나! 안에 있는 for문도 처음 j가 1번 돌 때 i도 1번, j가 2번 돌 때 i도 2번 도는 식, 즉 j와 관련이 있따.) 
		 * */
		
		System.out.println("----------------------");
		for(int j=0;j<4;j++) { // 4번 반복될 것이니까 j는 4번
			
			for(int i=0;i<j+3;i++) // i가 3부터 출력 되어야 하니까 i<j+3, 아래서 출력되던 내용을 인덱스에서 반복되게 
				System.out.printf("%d ", i+1);  // 옛날에는 출력값을 컨트롤했다면, 
			
			System.out.println();
		
		}
		System.out.println("----------------------");
	}

}


