package problem_solving.math;

import java.util.Scanner;

public class BaekJoon_27433 {
	public static Long fac(Long n) {
		if( n == 1 || n == 0 ) {
			return (long) 1; 
		}else {
			return n * fac(n-1);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Long n = Long.parseLong(sc.next());
		System.out.println(fac(n));
	}


}
