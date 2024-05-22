package problem_solving.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int [] arr = new int[n];
		StringBuilder sb = new StringBuilder();
		for(int i= 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(arr);
		
		for(int i= 0 ; i < n ; i++) {
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);
		
	}

}
