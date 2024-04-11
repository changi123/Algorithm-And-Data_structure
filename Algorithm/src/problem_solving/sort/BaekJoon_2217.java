package problem_solving.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Integer []arr2 = new Integer[n];
		
		for(int i= 0 ; i < arr2.length;i++) {
			arr2[i] = Integer.parseInt(sc.next());
		}
		System.out.println(Arrays.toString(arr2));
	}

}
