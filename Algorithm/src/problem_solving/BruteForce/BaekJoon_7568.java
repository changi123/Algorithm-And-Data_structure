package problem_solving.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int [][] arr = new int[n][2];

		for(int i= 0 ; i < n ; i++) {

			for(int j = 0 ; j < 2 ; j++) {
				arr[i][j] = Integer.parseInt(sc.next());
			}
		}
		for(int i= 0 ; i < n ; i++) {
			// 등수 매길 것 
			int cnt = 1 ; 
			// 몸무게와 키 합
			int sum = arr[i][1]+arr[i][0];
			for(int j = 0 ; j < n ;  j++) {
				if( i == j ) {
					continue;
				}
				// 비교할 대상의 키 몸무게 합	
				int compareSum = arr[j][0]+arr[j][1];
				if( compareSum > sum && arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					cnt++;
				}
			}
			System.out.print(cnt+ " ");
		}
		
		


	}

}
