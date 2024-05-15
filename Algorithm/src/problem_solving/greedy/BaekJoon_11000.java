package problem_solving.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_11000 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int [][] arr = new int[n][2];
		
		for(int i= 0 ; i < n ; i++) {
			
			for(int j = 0 ; j < 2 ; j++) {
				arr[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		Arrays.sort(arr,(a1,a2)->a1[0]-a2[0]);
		int cnt =0 ;
		Queue<Integer> q = new LinkedList<Integer>();

		while(true) {
			
		}
		
		
//		System.out.println(Arrays.deepToString(arr));
		
	}

}
