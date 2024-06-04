package problem_solving.stack;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_3986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int cnt = 0 ; 
		for(int i= 0 ; i < n ; i++) {
			Stack<Character> st = new Stack<>();
			String s = sc.next();
			char [] arr = s.toCharArray();
			st.push(arr[0]);
			for(int j= 1 ; j < arr.length;j++) {
				if( st.isEmpty()) {
					st.push(arr[j]);
					continue;
				}
				char c = st.peek();
				if( arr [j] == c  ) {
					
					
					st.pop();
				} else if( arr[j] != c && !st.contains(arr[j])) {
					st.push(arr[j]);
				} else if( arr[j]!= c && st.contains(arr[j])) {
					break;
				}
			}
			if( st.isEmpty()) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
