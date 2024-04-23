package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1049 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int [] packPrice = new int[m];
		int [] onePrice = new int[m];
		
		int sum = 0 ; 
		for(int i= 0 ; i < m ; i++) {
			packPrice[i] = Integer.parseInt(sc.next());
			onePrice[i] = Integer.parseInt(sc.next());
		}
		
		
		Arrays.sort(packPrice);
		Arrays.sort(onePrice);
		
		

		
		sum = ( n / 6 ) * packPrice[0];
		
		if( n % 6 == 0) {
			if( packPrice[0]*(n/6) > onePrice[0]*n) {
				System.out.println(onePrice[0]*n );
			}else {
				System.out.println( packPrice[0]*(n/6));
			}
			return ;
		}

		
		int num = n % 6 ;
		
		if( num*onePrice[0] > packPrice[0] ) {
			sum+=packPrice[0];
		}else {
			sum+=onePrice[0]*num;
		}
		
		
		System.out.println(sum);
		
		
		
	}

}
