package problem_solving.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_1817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int sum =  0 ; 
		
		Stack<Integer> st = new Stack<>();
		
		while(n-- > 0 ) {
			st.push(Integer.parseInt(sc.next()));
		}
		int cnt = 0 ; 
		while(!st.isEmpty()) {
			int weight = st.peek();
			if( sum + weight <= m ) {
				sum += weight;
				st.pop();
				if( st.isEmpty()) {
					cnt++;
				}
			} else {
				cnt++;
				sum = 0 ;
			}
		}
		
		
		System.out.println(cnt);
		
	}

}
