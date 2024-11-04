package problem_solving.stack;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_17952 {

	static class At {
		int A = 0 ; 
		int T = 0 ; 
		At(int A , int T ){
			this.A= A;
			this.T = T;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		sc.nextLine();
		Stack<At> st = new Stack();
		int score = 0 ; 
		while(t-- > 0 ) {

			String [] arr = sc.nextLine().split(" ");
			if( arr[0].equals("1")) {
				if(arr[2].equals("1")) {
					score+= Integer.parseInt(arr[1]);
					
				}else {
					st.push(new At(Integer.parseInt(arr[1]),Integer.parseInt(arr[2])-1));
				}
			} else {
				if( !st.isEmpty()) {

					At at = st.peek();
					if(at.T == 1) {
						score+= at.A;
						st.pop();
					}else {
						st.pop();
						st.push(new At(at.A,at.T-1));
					}
				} else {
					continue;
				}
			}

		}

		System.out.println(score);
	}

}
