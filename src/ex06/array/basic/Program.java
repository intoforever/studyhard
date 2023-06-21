package ex06.array.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Scanner;

import javax.security.auth.callback.ConfirmationCallback;
import javax.xml.crypto.Data;

import com.newlecture.app.ex6.control.loop.while_do;

public class Program {

	public static void main(String[] args) throws IOException {

//		/* 
//		 * 문제: 영어 성적 3개를 저장하기 위한 정수형 배열 engs를 생성하시오.
//		 * 풀이날짜: 230621
//		 * 
//		 */
//		
//		int[] engs = new int[3];
		
//		-----------------------------------------------------------------------------------
		
		/*
		 * 문제: 파일에서 값 90을 찾아서 그 값을 1번째 위치 값과 바꾸어 저장하시오.
		 * 풀이날짜: 230621
		 * 
		 */
		int[] nums = new int[100];
		int size = 0; // 파일 안에 콘텐츠가 몇 개인지 알 수 있는 방법
		
// 1. 값 로드하기
		{	
			FileInputStream fis = new FileInputStream("res/Array/data.txt");
			Scanner fscan = new Scanner(fis);
			for(int i=0; fscan.hasNextInt(); i++) {
//				nums[i] = fscan.nextInt();		//한 줄로 써도 되지만,
				int num = fscan.nextInt();		//이렇게 코드를 펼쳐쓰면, 가독성이 좋아진다.
				nums[i] = num;
				size++;
			}//  for i (값 읽어서 배열에 넣기)
			
			fscan.close();
			fis.close();
		}// 지역화 (값 로드하기)
		
		
// 2. 배열 nums 출력하기
		{
			// 핵심은 반복횟수를 세어주는 size라는 변수를 추가하는 것
			// nums.length라고 했을 때 0이 계속 나오는 이유는 위에 nums의 크기가 100이기 때문이다.
			for(int i=0; i<size; i++)
				System.out.printf("%d, ", nums[i]);
			System.out.println();
		}// 지역화 (nums 출력하기)
		
		
//3. 90점이 있는 위치 찾기
		// 인덱스의 위치가 0이 될 수 있기 때문에 발견될 리 없는 값인 -1을 초기화로 한다.
		int index = -1;
		{
			for (int i=0; i<size; i++)
				if(nums[i] == 90) {
					index = i;
					break;
				}// if (인덱스 구하고 빠져나오기)
			
			System.out.printf("index: %d\n", index);
		}// 지역화 (인덱스 출력하기)
		
		
//4. 100과 90의 값 위치 바꾸기 (0<->index 위치의 값 바꾸기)
		{
			int temp = 0;
			temp = nums[index];
			nums[index] = nums[0];
			nums[0] = temp;
			
			for(int i=0; i<size; i++)
				System.out.printf("%d, ", nums[i]);
			System.out.println();
		}// 지역화 (100과 90 값 위치 바꾸기)
		
		
//5. 값을 파일에 다시 저장하기
		{
			FileOutputStream fout = new FileOutputStream("res/Array/data.txt");
			PrintWriter fout2 = new PrintWriter(fout, true, Charset.forName("UTF-8"));
			
			for(int i=0; i<size; i++)
				fout2.printf("%d ", nums[i]);
			
			fout2.close();
			fout.close();
		}// 지역화 (파일에 값 위치 바꾼 대로 출력하기)
		
	}// main
}// class
