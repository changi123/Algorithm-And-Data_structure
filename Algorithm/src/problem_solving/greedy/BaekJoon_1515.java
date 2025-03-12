package problem_solving.greedy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1515 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		Queue<Character> q = new LinkedList<Character>();
		
		for(int  i = 0 ; i < t.length();i++) {
			q.offer(t.charAt(i));
		}
		int num = 1 ; 
		while(true) {
			String s  = Integer.toString(num);
			
			for(int i = 0 ; i < s.length();i++) {
				if( q.peek() == s.charAt(i)) {
					q.poll();
				}
				if( q.isEmpty()) {
					System.out.println(num);
					return ;
				}
			}
			num ++;
		}
	}

}
