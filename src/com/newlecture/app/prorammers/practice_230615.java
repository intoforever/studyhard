package com.newlecture.app.prorammers;

import java.util.Iterator;

public class practice_230615 {

	public static void main(String[] args) {

		for(int i=0; i<4; i++) {
			for(int j=0; j<4+i; j++)
				if(j<3-i)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.println();
		}//for i
		
		for(int k=0; k<3; k++) {
			for(int l=0; l<6-k; l++)
				if(l<1+k)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.println();
		}//for k
		
		
		
		
		
		
		
		
		
		
	}//main
}//class






//		for(int i=0; i<7; i++) {
//			//i가 0,1,2,3일 때만 출력, 공백이 3에서 1씩 줄어듬 & 별이 1에서 2씩 늘어남
//				for(int j=0; j<(3-j); j++)		
//					System.out.print(" ");
//				for(int j=0; j<; j++)
//					System.out.print("*");
//				
//			//i가 4,5,6일 때만 출력, 공백이 1에서 1씩 늘어남(최대 3개) & 별이 5에서 2씩 줄어듬 
//				for(int k=0; k<; k++)	
//					System.out.print(" ");
//				for(int k=0; k<5-(2*k); k++)   // 4->5 5->3 6->1
//					System.out.print("*");
//			}
//			System.out.println();
//		}//for i
		
