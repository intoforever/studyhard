package com.newlecture.app.ex6.control.loop;


public class homework_230619 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++)
				if(j<i)
					System.out.print(" ");
				else if(j<9-(2*i))
					System.out.print(j+1);
				else 
					System.out.print(" ");
				

			System.out.println();
		}//for i
			
			
	}

}
