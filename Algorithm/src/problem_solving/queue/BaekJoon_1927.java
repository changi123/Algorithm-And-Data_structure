package problem_solving.queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon_1927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		while(n-- >  0 ) {
			int num = Integer.parseInt(sc.next());
			if( num !=0 ) {
				pq.offer(num);
			} else if ( num == 0 ) {
				if( pq.isEmpty()) {
					sb.append(0+" "+"\n");
				} else {
					sb.append(pq.poll()+ " "+ "\n");
				}
			}
			
		}
		
		System.out.println(sb.toString());
		


	}

}
