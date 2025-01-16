package problem_solving.dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1260 {
	public static void dfs(int start, List<ArrayList<Integer>> graph, boolean[] visited) {

		visited[start] = true;
		StringBuilder sb = new StringBuilder();
		System.out.print(start+ " ");
		for(int num : graph.get(start)) {

			if( !visited[num]) {
				dfs(num, graph, visited);
			}

		}
	}




	public static void bfs(int start, List<ArrayList<Integer>> graph, boolean[] visited) {

		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(start);
		visited[start] = true;
		StringBuilder sb = new StringBuilder();

		while(!q.isEmpty()) {
			int node = q.poll();

			sb.append(node+" ");

			for(int num : graph.get(node)) {

				if( !visited[num]) {
					visited[num] = true;
					q.offer(num);
				}
			}

		}
		System.out.println(sb.toString());

	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int v = Integer.parseInt(sc.next());

		List<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i =0 ; i <= n ;i++) {
			graph.add(new ArrayList<>());
		}

		for(int i =0 ; i <m ; i++) {			
			int start = Integer.parseInt(sc.next());
			int end = Integer.parseInt(sc.next());
			graph.get(start).add(end);
			graph.get(end).add(start);

		}


		for(int i= 0 ; i < graph.size();i++) {			
			Collections.sort(graph.get(i));
		}


		boolean [] bfsVisited = new boolean[n+1];
		boolean [] dfsVisited = new boolean[n+1];



		dfs(v,graph, dfsVisited);
		System.out.println();
		bfs(v , graph, bfsVisited);


	}



}
