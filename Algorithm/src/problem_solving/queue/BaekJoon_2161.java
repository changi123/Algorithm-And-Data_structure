package problem_solving.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();


		int n = Integer.parseInt(sc.next());
		for(int i= 1 ; i <= n ; i ++) {
			q.offer(i);
		}

		int i = 1 ;
		while(q.size()!=1) {
			System.out.print(q.poll()+ " ");
			int num = q.poll();
			q.add(num);
			
		}


		System.out.println(q.peek());

	}

}
