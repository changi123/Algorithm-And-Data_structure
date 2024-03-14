package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_13305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int [] a = new int[N-1];
		int [] b = new int[N];
		
		
		for(int i= 0 ; i <a.length ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		for(int i= 0 ; i <b.length ; i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int price= 0 ;
		for(int i= 0 ; i <a.length ; i++) {
//			if( i == a.length -1) {
//				break;
//			}
			int num = a[i] ;
			int sum = 0 ;
			for(int j = i+1 ; j < a.length ; j++) {
				sum+= a[j];
			}
			if( sum > num) {
				price+= a[i]*b[i];
			}
		}
		System.out.println(price);
		
	}

}
