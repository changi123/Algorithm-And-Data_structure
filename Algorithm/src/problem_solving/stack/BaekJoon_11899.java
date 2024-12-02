package problem_solving.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_11899 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] s = sc.next().split("");
//		System.out.println(Arrays.toString(s)); [), ), ), (, )]
		Stack<String> st = new Stack<>();
		int cnt = 0 ;
		for(int i = 0 ; i < s.length; i++) {
			if( st.isEmpty()) {
				if( s[i].equals(")")) {
					cnt++;
				} else {					
					st.push(s[i]);
				}
			} else {
				if(st.peek().equals("(") && s[i].equals(")")) {
					st.pop();
				} else if( st.peek().equals("(") && s[i].equals("(")){
					st.push(s[i]);
				}
			}
			
		}
		System.out.println(cnt+st.size());
		
	}

}
