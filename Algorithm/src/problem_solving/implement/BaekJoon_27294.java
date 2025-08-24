package problem_solving.implement;

import java.util.Scanner;

public class BaekJoon_27294 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		int s = Integer.parseInt(sc.next());
		
		if (s == 1 || ( t < 12 && t > 16)) {
			System.out.println(280);
		} else if( ( t>=12 && t<=16 ) && s == 0 ) {
			System.out.println(320);
		} else {
			System.out.println(280);			
		}

	}

}
