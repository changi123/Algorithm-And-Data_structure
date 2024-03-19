package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BackJoon_1541 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] s = sc.nextLine().split("-");
		
		
		int sum = 0 ;
		for(int i = 0 ; i <s.length;i++) {
			int arrSum = 0;
			String[] addArr =  s[i].split("\\+");
			
			for(int j = 0 ; j  < addArr.length ;j++) {
				arrSum+=Integer.parseInt(addArr[j]);
				
			}
			
			if( i == 0) {
				sum =arrSum;
			} else {
				sum-=arrSum;
			}
		}
		System.out.println(sum);
	}

}

