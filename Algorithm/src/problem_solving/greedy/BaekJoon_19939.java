package problem_solving.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_19939 {
	
	static int [] arr = new int[1];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		arr = new int [k];
		int sum = sumFunc1(arr);
//		int sum = sumFunc(arr);
		n-=sum;
		while(true) {
			sum = sumFunc(arr);
		}
		
	}
	public static int sumFunc1(int[] arr) {
		int sum = 0 ;
		for(int i= 0 ; i <arr.length;i++) {
			arr[i] = i+1;
			sum+=arr[i];
		}
		return sum;
		
	}
	public static int sumFunc(int[] arr) {
		int sum = 0 ; 
		for(int i= 0 ; i <arr.length;i++) {
			int num = arr[i];
			arr[i] = num +1;
			sum+=arr[i];
		}
		return sum;
		
	}

}
