package problem_solving.math;

import java.util.Scanner;

public class BaekJoon_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		
		int min = Math.min(x,y);
		
		int answer = Math.min( Math.abs(x-w) , Math.abs(y-h)  );
		
		
		
		
		System.out.println(Math.min(min, answer));
	}

}
