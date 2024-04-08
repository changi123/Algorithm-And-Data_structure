package problem_solving.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BaekJoon_2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= Integer.parseInt(sc.next());
		double sum = 0 ; 
		int [] arr = new int[n];
		for(int i= 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(sc.next());
			sum+=arr[i];
			
		}
		
		// 최빈값 어렵다 ...	
	 
		Arrays.sort(arr);
		System.out.println(Math.round(sum/n)); 
		System.out.println(arr[arr.length/2]);
		
		
		System.out.println(arr[arr.length-1]-arr[0]);
		
	}

}
