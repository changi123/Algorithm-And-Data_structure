package problem_solving.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_28278 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		while(t -- > 0 ) {

			int num = Integer.parseInt(sc.next());
			int num2 = 0 ; 
			if( num == 1 ) {
				num2 = Integer.parseInt(sc.next());
			}

			if(num == 1 ) {
				st.push(num2);
			} else if(num == 2 ) {
				if( !st.isEmpty()) {
					sb.append(st.pop()+""+'\n');
				}else {
					sb.append(-1+""+'\n');
				}
			} else if(num == 3 ) {
				sb.append(st.size()+""+'\n');
			} else if(num == 4 ) {
				if(!st.isEmpty()) {
					sb.append(0+""+'\n');
				}else {
					sb.append(1+""+'\n');
				}
			} else if(num == 5 ) {
				if( !st.isEmpty()) {
					sb.append(st.peek()+""+'\n');
				}else {
					sb.append(-1+""+'\n');
				}
			}
			
		}
		
		System.out.println(sb.toString());
		
		
		




	}

}
