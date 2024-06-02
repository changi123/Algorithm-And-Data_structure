package problem_solving.greedy;

import java.util.Scanner;

public class BaekJoon_2599 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());
		int cnt = 0 ;
		int num = 1 ;
		while(num<k) {
			num *= 2;
		}
		
		int [] arr = new int[2];
		arr[0] = num ;
		
		while(k> 0 ) {
			if( k >= num ) {
				k-=num;
			}else {
				num /= 2;
				cnt++;
			}
		}
		
		
		arr[1] = cnt;
		
		for(int i= 0 ; i <arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	
		
		
	}
	


}
