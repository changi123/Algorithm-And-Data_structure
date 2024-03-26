package problem_solving.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		int sum = 0 ;
		for(int i =  0 ; i < 5; i ++) {
			arr[i] = Integer.parseInt(sc.next());
			sum+=arr[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(sum / arr.length);
		System.out.println(arr[arr.length / 2 ]);
	}

}
