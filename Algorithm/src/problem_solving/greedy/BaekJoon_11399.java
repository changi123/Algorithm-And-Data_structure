package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int [] arr =new int[n];
		for(int i= 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		int A = 0 ;
		int sum = 0 ;
		for(int i= 0 ; i < arr.length ; i++) {
			if( i == 0 ) {				
				A = arr[i] ;
				sum+=A;
				continue;
			}else {
				A = A+arr[i];
				sum+=A;
			}
			
		}
		System.out.println(sum);
	}

}
