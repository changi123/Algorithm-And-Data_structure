package problem_solving.search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon_1260 {
	static int [][] arr = new int[1001][1001];
	static boolean [] check = new boolean[1001];
	static int n;
	static int m;
	static int v;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());
		v = Integer.parseInt(sc.next());
		for(int i = 0 ;  i < m ; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			arr[a][b]= 1;
			arr[b][a]= 1;
		}
		dfs(v);

		
	}
	
	public static void dfs(int v ) {
		check[v] = true;
		System.out.print(v+ " ");
		for(int i= 1 ; i <= n ; i++) {
			if( check[i] == false && arr[v][i] ==1) {
				dfs(i);
			}
		}
	}

}
