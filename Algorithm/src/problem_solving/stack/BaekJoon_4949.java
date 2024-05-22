package problem_solving.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_4949 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		while(true) {
			Stack<Character> st = new Stack<>();
			String startOrEnd = sc.nextLine();
			if( startOrEnd.equals(".")) {
				break;
			}

			for(int i= 0 ; i <startOrEnd.length();i++) {
				if( startOrEnd.charAt(i) == '(' || startOrEnd.charAt(i) == '[' ) {
					st.push(startOrEnd.charAt(i));
				} else if ( startOrEnd.charAt(i) == ')' ||startOrEnd.charAt(i) == ']' ) {
					if( st.isEmpty()|| (st.peek() == '(' && startOrEnd.charAt(i)==']') ||
							(st.peek()=='[' && startOrEnd.charAt(i)==')')) {
						st.push(startOrEnd.charAt(i));
						break;
					}
					st.pop();
				}
				
			}
			
			if( !st.isEmpty()) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
			
		}


	}


}
