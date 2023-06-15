package com.newlecture.app;

public class Hello {
	public static void main(String[] args) {

		// 자료형
		int kor1, kor2, kor3;
		int total;
		float avg;

		// 변수 대입
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		byte x = (byte)300; // byte는 2^7-1까지만 표현 가능함

		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;

		// 출력
		System.out.printf("total is %d\n", /* 정수형 */ total);
		System.out.printf("avg is %.2f\n", /* 실수형 */ avg);
		System.out.println(x);
		

	}
}