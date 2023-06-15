package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {

		// FileInputStream 객체 fis를 생성해주시고요. 파일명은 res/pic1.bmp입니다.
		FileInputStream fis = new FileInputStream("res/pic1.bmp"); // 바이트 단위로 읽어옴

		// 4바이트 데이터 읽기
		int n1, n2, n3, n4;

		for(int i=0;i<18;i++){
			fis.read();
		}

		// 추가로 4바이트는 정수형 변수 n1, n2, n3, n4에 저장해주세요. (파일 사이즈)
		n1 = fis.read();
		n2 = fis.read();
		n3 = fis.read();
		n4 = fis.read();
		
		int Width = (n1<<0)&0x000000ff | (n2<<8)&0x0000ff00 | (n3<<16)&0x00ff0000 | (n4<<24)&0xff000000;

		// 각 변수들을 "10, 20, 30, 40"과 같은 포맷으로 콘솔에 출력해주세요.
		System.out.printf("%x, %x, %x, %x\n", n1, n2, n3, n4);
		System.out.println("Width : " + Width);

		
		fis.close();
		System.out.println("작업완료");
	}

}
