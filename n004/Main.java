package algorithm.n004;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number10 = 19; // 10Áø¼ö
		int split = number10; // ¸ò
		
		int[] arrNumber2 = new int[10]; // 2Ä£¼ö
		
		// 19/2 = 9, 1
		// 9/2 = 4, 1
		// 4/2 = 2, 0
		// 2/2 = 1, 0
		// 1/2 = 0, 1	
		
		int i = 0;
		while (true) {
			arrNumber2[i] = split%2;
			split = split/2;
			
			if (split == 0) {
				break;
			}
			
			i++;
		}
		
		for (int j = i; j >= 0; j--) {
			System.out.print(arrNumber2[j]);
		}
		
		
	}

}
