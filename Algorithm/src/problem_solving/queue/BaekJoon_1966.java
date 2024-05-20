package problem_solving.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1966 {

	static Queue<Integer> q = new LinkedList();
	static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	static int cnt ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.next());
		while(T>0) {
			cnt = 0 ;
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			int check = 0 ;
			
			if( n == 1) {
				int num = Integer.parseInt(sc.next());
				System.out.println(1);
				continue;
			}
			for(int i= 0 ; i  < n ; i++) {
				int num = Integer.parseInt(sc.next());
				if( i == m ) {
					check = num;
				}
				q.offer(num);
				pq.offer(num);
			}
			
			
			while(!maxCheck(check)) {
//				int a = q.poll();
//				q.offer(a);
//				System.out.println(q.toString());
//				System.out.println(pq.toString());
			}
			
			while(!numCheck(0)) {
				if( q.peek()==0) {
					break;
				}
				System.out.println(cnt);
				
			}
			System.out.println(cnt);
			pq.clear();
			q.clear();
			T--;
		}

	}
	
	public static boolean maxCheck(int m ) {
		if( pq.peek() == m) {
			q.poll();
			q.offer(0);
			return true;
		}else {
			pq.poll();
			q.offer(q.poll());
			return false;
		}
	}
	public static boolean numCheck(int m ) {
		if( q.poll() == 0) {
			cnt++;
			System.out.println(q.toString());
			return true;
		}else {
			cnt++;
			System.out.println(q.toString());
			return false;
		}
	}

}
