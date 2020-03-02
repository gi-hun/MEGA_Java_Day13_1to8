package day_13;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[2�ܰ�] : 1 to 9
 * 1. arr�迭�� 1~9 ������ ���ڸ� �����Ѵ�.
 * 2. shuffle�� ���� ���ڸ� ���´�.
 * 3. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 4. ������ ���߸� �ش� ���� 0���� ����Ǿ� ��� ���� 0�̵Ǹ� ������ ����ȴ�.
 */

public class ArrayEx25_���� {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[9];
	
		for(int i=0; i<9; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}
		
		int num = 1;
		while(true) {
			
			System.out.println("[" + num + "]");
			for(int i=0; i<9; i++) {
				System.out.print(arr[i] + "\t");
				if(i % 3 == 2) {
					System.out.println("\n");
				}
			}
			
			System.out.print("�Է� : ");
			int idx = scan.nextInt();
			
			if(arr[idx] == num) {
				arr[idx] = 0;
				num += 1;
			}
			
			if(num == 10) {
				break;
			}
		}
		
	}
}