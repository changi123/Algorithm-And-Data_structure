package problem_solving.greedy;

import java.util.Scanner;

public class BaekJoon_1789 {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		
//		Long N = Long.parseLong(sc.next());
//		int i= 1;
//		while(true) {
//			if( (i*i) + i >N*2) {
//				break;
//			}
//			i++;
//		}
//		System.out.println(i-1);
//		
//		
		
		Scanner sc =new Scanner(System.in);
		
		Long N = Long.parseLong(sc.next());
		int cnt = 0 ;
		int i = 0;
		while(true) {
			if( N - i <= i) {
				break;
			}
			N -=i;
			i++;
			cnt++;
			
		}
		System.out.println(cnt);
	}

}
