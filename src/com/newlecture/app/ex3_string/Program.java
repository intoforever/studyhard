package com.newlecture.app.ex3_string;

public class Program {

	public static void main(String[] args) {
		
		String name1 = "아이유";
		String name2 = new String("아이유");
		
		System.out.println(name1 == name2); // true 같은 객체를 참조하고 있는지를 비교
		System.out.println(name1.equals(name2)); // false 객체의 값이 같은지를 비교
		System.out.println(name1 == "아이유"); // true
		
		String fileName = "photo.jpg";
		System.out.println(fileName.length());
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.substring(0,3));
		
		// 위의 파일명에서 확장자를 제외한 파일명만 출력하시오.
		// = 위의 파일명에서 점(.)이 있는 곳까지의 문자열을 출력하시오. (단 점(.) 빼고 출력)
		
		int index = fileName.indexOf("."); // 점(.)의 위치를 구한다.
		String name = fileName.substring(0,index); // index 변수를 활용해서 name만 구하자.
		System.out.println(name); // name 변수를 출력하자!
		
//		------------------------------------------------
//		int x1 = 3;
////		Integer 정수갑옷 = new Integer(x);
//		Integer 정수갑옷 = Integer.valueOf(x1); // Boxing
//		int x2 = 정수갑옷.intValue(); // Unboxing
//		
//		double d1 = 3.9;
//		Double 더블갑옷 = Double.valueOf(d1); // Boxing
//		double d2 = 더블갑옷.doubleValue(); // Unboxing
//
//		
//		int n1 = 10;
////		String s1 = Integer.toString(n1); // 내가 쓴답
//		String s1 = String.valueOf(n1); // 쌤 답
//		
//		String s2 = "30.2";
//		double n2 = Double.parseDouble(s2); // 내가 쓴 답 = 쌤 답
	
		
	}

}
