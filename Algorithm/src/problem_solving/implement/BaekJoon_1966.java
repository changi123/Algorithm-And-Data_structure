package problem_solving.implement;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class BaekJoon_1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());

		for(int i= 0 ; i < t; i++) {
			int n = Integer.parseInt(sc.next()); // 문서의 개수
			int m = Integer.parseInt(sc.next()); // 궁금한 문서의 인덱스 번호 ?

			Queue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
			Queue<Integer> q = new LinkedList<>();

			int cnt = 0 ;
			for(int j = 0 ; j < n ; j++) {
				int num = Integer.parseInt(sc.next());
				if( j == m ) {
					q.add(0);
				}else {					
					q.add(num);
					pq.add(num);
				}
			}



			System.out.println(q.toString());
			System.out.println(pq.toString());




		}


	}

}
