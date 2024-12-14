package problem_solving.bruteForce;

import java.util.Scanner;

public class BaekJoon_1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int cnt= 0 ;
		String start = "666";
		while(cnt != n ) {
			if(start.contains("666")) {
				cnt++;
			}
			start = Integer.toString(Integer.parseInt(start)+1) ;
		}
		System.out.println(Integer.parseInt(start)-1);
	}

}
