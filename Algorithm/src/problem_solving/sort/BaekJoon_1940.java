package problem_solving.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1940 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int [] arr = new int[n];
		for(int i= 0 ; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		int cnt = 0 ;
		Arrays.sort(arr);
		for(int i= 0 ; i < arr.length; i++) {
			
			int num = arr[i];
			for(int j = i+1 ;  j < arr.length; j++) {
				if(num + arr[j] == m ) {
					cnt++;
					break;
				}
			}
			
		}
		System.out.println(cnt);
	}

}
