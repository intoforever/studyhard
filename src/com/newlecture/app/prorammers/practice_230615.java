package com.newlecture.app.prorammers;

import java.util.Iterator;
import java.util.Scanner;

public class practice_230615 {

	public static void main(String[] args) {

		int num = 88;
		for (int i = 0; i < num; i++) { // 인덱스: 0, 반복: 숫자만큼, 인덱스 1씩 증가
			while(num%(i+2)==0) { // 숫자를 (i+2)로 나눴을 때 나머지가 0이면 나눠지는 값이고, while로 작은 수를 최대한 많이 나눠서 중복을 없애준다.
				System.out.println(i+2);
				num=num/(i+2);
			}
			

		}
	}

}
