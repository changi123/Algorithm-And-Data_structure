package problem_solving.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon_3273 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int [] arr = new int [n];
		for(int i=0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(arr);
		int sum = Integer.parseInt(sc.next());
		
		Set<Integer> set = new HashSet<>();
		for(int i= 0 ; i < arr.length ; i++) {
			
			if( set.contains(arr[i])) {
				continue;
			}
			for(int j = arr.length-1-i ; j > i ; j--) {
				
				if( arr[i] + arr[j] == sum) {
					set.add(arr[i]);
					set.add(arr[j]);
					break;
				}
			}
		}
		System.out.println(set.size()/2);
	}

}
