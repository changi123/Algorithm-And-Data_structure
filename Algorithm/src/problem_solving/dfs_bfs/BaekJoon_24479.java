package problem_solving.dfs_bfs;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_24479 {
	static boolean [] visited ;; 
	static int [] sec ; 
	static int [][] arr ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int start = Integer.parseInt(sc.next());

		arr = new int[n][n];
		visited = new boolean[n];
		sec = new int[n];
		                    
		
		for(int i= 0 ; i < arr.length;i++) {
			
			int u = Integer.parseInt(sc.next());
			int v = Integer.parseInt(sc.next());
			for(int j = 0 ; j < arr[0].length;j++) {
				arr[u-1][v-1] = 1;
				arr[v-1][u-1] = 1;
			}
		}
		
		int cnt = 1 ; 
		visited[start-1] = true;
		sec[start -1 ] = cnt;
		dfs(start, cnt );
		
		
		
		
	}
	
	public static void dfs(int start, int cnt ) {

		for(int i= 0 ; i < arr[start-1].length;i++) {
			if( arr[start-1][i] == 1 && visited[i] == false) {
				visited[i] = true;
				cnt+=1;
				sec[i] = cnt;
				start = i+1 ;
			}
		}
		if( visited[start] == false) {
			
			StringBuilder sb = new StringBuilder();
			for(int i= 0 ; i < sec.length;i++) {
				sb.append(sec[i]);
				sb.append('\n');
			}
			System.out.println(sb.toString());
			System.exit(0);
		}else {			
			dfs(start , cnt );
		}
	}

}
