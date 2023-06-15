package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.IOException;

public class homework1_230612 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		
		System.out.println("---------------------------------");
		System.out.println("1번문제: 파일 크기");
		
		// Signature 날리기
		{
			fis.read();
			fis.read();
		}
		
		// File Size 날리기
		{
			fis.read();
			fis.read();
			fis.read();
			fis.read();
		}

		// Reserved 2개 날리기
		{
			fis.read();
			fis.read();
			fis.read();
			fis.read();
		}
		
		// File Offset to PixelArray 날리기
		{
			fis.read();
			fis.read();
			fis.read();
			fis.read();
		}
		
		// DIB Header Size 날리기
		{
			fis.read();
			fis.read();
			fis.read();
			fis.read();
		}
		
		//Image Width(w), height(h)
		{
			int w1 = fis.read();
			int w2 = fis.read();
			int w3 = fis.read();
			int w4 = fis.read();
			
			int h1 = fis.read();
			int h2 = fis.read();
			int h3 = fis.read();
			int h4 = fis.read();
			
			
			// int size = n;
			// 우리의 경우는 변수에 하나씩 다 넣어줬기 때문에 빈그릇이었지만
			// 시프트 하다가 보면 다른 비트에 있는 내용이 그대로 남아있어서 내용이 변질되어서 문제를 발생시킬 수 있다.
			
			// 내 데이터에는 영향을 주지 않으면서 나머지 비트를 비우는 작업이다.
			// [  ][  ][  ][5e]   (n<<0)&0(십진수)x000000ff // 0이 곱해지는 부분은 다 0으로 바꾸고 나머지만 ff로 바꾼다. 
			// [  ][  ][65][  ]   (n<<8)&0(십진수)x0000ff00  
			// [  ][24][  ][  ]   (n<<16)&0(십진수)x00ff0000 
			// [00][  ][  ][  ]   (n<<24)&0(십진수)xff000000
			
			
			int width = (w1<<0) | (w2<<8) | (w3<<16) | (w4<<24);
			int height = (h1<<0) | (h2<<8) | (h3<<16) | (h4<<24);
			
			System.out.printf("%d X %d\n", width, height);
		}
		

	}

}
