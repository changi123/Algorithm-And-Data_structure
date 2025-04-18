package problem_solving.greedy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_13417 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		
		while(T--  > 0 ) {
			int n = Integer.parseInt(sc.next());
			Deque<String> dq = new ArrayDeque<>();
			dq.addFirst(sc.next());
			StringBuilder sb = new StringBuilder();
			for(int i = 1 ; i < n ; i++) {
				String s = sc.next(); 
				String compare = dq.peek(); 
				if(compare.compareTo(s) < 0 ) {
					dq.addLast(s);
				}else {
					dq.addFirst(s);
				}
			}
			for(String s : dq) {
				sb.append(s);
			}
			System.out.println(sb);
//			System.out.println(dq.toString());
		}
	}

}
