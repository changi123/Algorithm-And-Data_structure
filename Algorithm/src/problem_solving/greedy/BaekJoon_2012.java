package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2012 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] arr = new int[N];
		Long sum = (long)0 ; 
		for(int i= 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.nextLine();
		Arrays.sort(arr);
		
		for(int i= 0 ; i < N ; i++) {
			int front = i+1;
			int back = arr[i];
			if( front != back) {
				int abs = Math.abs(front-back);
				sum+=abs;
			}
			
		}
		
		
		
		
		System.out.println(sum);
		
	}

}
