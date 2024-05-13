package problem_solving.greedy;

import java.util.Scanner;

public class BaekJoon_2828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int amount = Integer.parseInt(sc.next());
		int dis = 0 ;
		int [] arr = new int[amount];
		for(int i= 0 ; i < amount; i++) {
			arr[i]= Integer.parseInt(sc.next());
		}
		

		int start = 0;
		int end = m;
		
		for(int i = 0 ; i<amount; i++) {
			if ( arr[i] < end ) {
				
			}
		}
		
		

	}

}
