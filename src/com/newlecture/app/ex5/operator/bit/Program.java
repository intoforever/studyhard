package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		// 4바이트 데이터 읽기
		int n1, n2, n3, n4;
		// FileInputStream 객체 fis를 생성해주시고요. 파일명은 res/pic1.bmp입니다.
		FileInputStream fis = new FileInputStream("res/pic1.bmp"); // 바이트 단위로 읽어옴
		{
			// 2바이트를 읽어서 버리세요. (확장자)
			fis.read(); // a byte of data, -1(int) 반환하지 못하는 경우 -1이 나와서 두 개를 모두 포괄하는 자료형인 int가 된 것
			fis.read();

			// 추가로 4바이트는 정수형 변수 n1, n2, n3, n4에 저장해주세요. (파일 사이즈)
			n1 = fis.read();
			n2 = fis.read();
			n3 = fis.read();
			n4 = fis.read();

			// 각 변수들을 "10, 20, 30, 40"과 같은 포맷으로 콘솔에 출력해주세요.
			System.out.printf("%x, %x, %x, %x\n", n1, n2, n3, n4);

			fis.close();
		}

		// 파일 크기 출력
		{
			// 36, 4b, 2c, 0 -> 0, 2c, 4b, 36 출력

//			// int size = n1;  [  ][  ][  ][36]
			// n2              [  ][  ][4b][  ]
			// n3              [  ][2c][  ][  ]
			// n4              [00][  ][  ][  ]

			
			// 비트 연산자, 파일에서 숫자를 읽어들이거나 
			int size = (n1 << 0) | (n2 << 8) | (n3 << 16) | (n4 << 24);
			System.out.printf("size : %d\n", size);
			
			// 3항 연산자, 크기를 벗어나거나 유효하지 않은 값일 경우 기본 값으로 대치할 수 있는 연산.
			// size가 해당 값보다 크면 "0"을 출력, 아니면 size 값 자체를 출력
			size = (size>10000)?0:size;
			System.out.println(size);

		}
		
	}
}
