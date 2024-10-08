package problem_solving.greedy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon_9237 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int t = Integer.parseInt(sc.next());
		for(int i= 0 ; i <t ; i++) {
			pq.offer(Integer.parseInt(sc.next()));
		}
		int max = 0;
		int day = 0  ;
		while(!pq.isEmpty()) {
			max = Math.max(max, pq.poll()+1+day++);
		}
		
		System.out.println(max+1);
	}

}
