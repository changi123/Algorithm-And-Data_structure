package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_12933 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String [] sr = sc.next().split("");
		
		
		Arrays.sort(sr);
		System.out.println(Arrays.toString(sr));
		
	}

}
