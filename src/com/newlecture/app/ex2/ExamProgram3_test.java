package com.newlecture.app.ex2;

import java.io.IOException;

public class ExamProgram3_test {

	public static void main(String[] args) throws IOException {
	
		
		int a = System.in.read(); // 1번, 아스키코드에서 십진수 57으로 읽고 정수형으로 저장함
		
//		int a = 9; // 2번, 아스키코드에서 십진수 10로 읽고 정수형으로 저장함
		
		System.out.write(a); // 1바이트를 문자로 읽는다! 1번 57의 문자 9를 반환 , 2번 10진수의 문자 LF 반환
		System.out.flush();
		
		System.out.print(a); // 1바이트 아님 문자열을 그대로 읽는다! 1번 10진수 57 그대로 반환, 2번 십진수 9그대로 반환
		
	
		
		

	}

}
