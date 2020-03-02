/*
 * # 1 to 50[2단계] : 1 to 9
 * 1. arr배열에 1~9 사이의 숫자를 저장한다.
 * 2. shuffle을 통해 숫자를 섞는다.
 * 3. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 4. 정답을 맞추면 해당 값은 0으로 변경되어 모든 값이 0이되면 게임은 종료된다.
 */

package day_13;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[9];
		
		for(int j=0;j<9;j++)
		{
			arr[j] = j+1;
		}
		
		int i = 0;
		while(i<1000)
		{
			int num = ran.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[num];
			arr[num] = temp;
			i++;
		}
		
		int start = 1;
		while(true)
		{
			System.out.print("[");
			for(int j=0;j<9;j++)
			{
				System.out.print(arr[j] + " ");
			}
			System.out.print("]");
			System.out.println();
			
			System.out.println("숫자를 입력하여라");
			int data = sc.nextInt();
			
			int check = 0;
			
			if(start == 9)
			{
				System.out.println("모든 인덱스를 맞췄습니다.");
				System.out.println("프로그램 종료");
				break;
			}
			
			for(int j=0;j<9;j++)
			{
				if(arr[data]==start)
				{
					arr[data] = 0;
					start++;
				}
			}
		}
	}
}
