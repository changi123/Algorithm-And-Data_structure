package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_20300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Long [] arr = new Long[n];
		for(int i= 0 ; i < arr.length;i++) {
			arr[i] = Long.parseLong(sc.next());
		}
		
		Arrays.sort(arr);
		
		Long answer = Long.parseLong("0") ;
		Long sum = Long.parseLong("0") ;
		if( n % 2 == 1 ) {
			
			for(int i = 0 ; i <arr.length / 2 ; i++) {
				sum = arr[i] + arr[arr.length-2-i];
				answer = Math.max(answer, sum);
			}
			System.out.println(Math.max(answer, arr[arr.length-1]));
			
		} else {
			for(int i = 0 ; i <arr.length / 2 ; i++) {
				sum = arr[i] + arr[arr.length-1-i];
				answer = Math.max(answer, sum);
			}
			System.out.println(answer);
		}	
		
	
		
	}

}
