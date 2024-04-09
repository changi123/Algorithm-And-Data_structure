package problem_solving.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_11004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int [] arr = new int[n];
		for(int i= 0 ; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[k-1]);
	}

}
