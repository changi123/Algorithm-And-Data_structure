package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = Integer.parseInt(sc.next());
		int [] arr = new int[L];
		
		for(int i= 0 ; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		int n = Integer.parseInt(sc.next());
	
		int min = 0 ; 
		int max = 0 ;
		int index = 0 ;
		int cnt = 0 ; 
		Arrays.sort(arr);
		
		if( n < arr[0] ) {
			
			if( n == 1 ) {
				for(int i = 1 ; i <= n ; i++ ) {
					
					for(int j = n ; j <= arr[0]-1 ; j++) {
						cnt++;
					}
				}
				System.out.println(cnt-1);
				return ;
			} else {
			for(int i = n-1 ; i <= n ; i++ ) {
					
					for(int j = n ; j <= arr[0]-1 ; j++) {
						cnt++;
					}
				}
			System.out.println(cnt-1);
			return ;
			}
			
		} 
		
		
		for(int i= 0 ; i < arr.length; i++) {
			if( arr[i] >= n ) {
				index = i;
				break;
			} 
		}
		
		if (index == 0 ) {	
			if( n == arr[0] ) {
				System.out.println(0);
			}else {				
				System.out.println(arr[0] - n- 1);
			}
			return ; 
		}
		min = arr[index-1];
		max = arr[index];
		
		if( n == max ) {
			System.out.println(0);
			return ; 
		}
		for(int i = min+1 ; i <= n ; i++ ) {
			
			for(int j = n ; j <= max-1 ; j++) {
				
				cnt++;
				
			}
		}
				
		System.out.println(cnt-1);
	}

}
