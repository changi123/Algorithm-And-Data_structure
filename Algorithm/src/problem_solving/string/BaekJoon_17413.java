package problem_solving.string;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_17413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack();
		for(int i= 0 ; i < s.length(); i++) {
			
			if( s.charAt(i) == '<') {
				st.push(s.charAt(i));
			} else if( s.charAt(i) == '>') {
				while(!st.isEmpty()) {
					sb.append(st.pop());
				}
				sb.append(">");
			} else {
				st.push(s.charAt(i));
				
			}
			
		}
	}

}
