package problem_solving.search;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2606 {

	static boolean[] check;
	static int [][] arr ;
	static int cnt =0;
	static int n =0;
	static int m =0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.next());
		m = Integer.parseInt(sc.next());
		check = new boolean[n+2];
		arr = new int[m][2];
		for(int i= 0 ; i < arr.length;i++) {
			for(int j = 0 ; j  < arr[i].length;j++) {
				arr[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		if( n == 1 ) {
			System.out.println(0);
			return ;
		}
		dfs(0);

		

	}

	public static void dfs(int a) {
		cnt++;
		
		if(cnt == n*100) {
			System.out.println(trueCheck()-1);
			System.exit(0);
		}
		int answer = trueCheck();
		if( arr[a][0] == 1) {
			check[ arr[a][0] ] = true;
			check[ arr[a][1] ] = true;
		}else if( arr[a][1] == 1) {
			check[ arr[a][0] ] = true;
			check[ arr[a][1] ] = true;
		} else if(	check[ arr[a][0] ] == true ) {
			check[ arr[a][1] ] = true;
		}else if( check[ arr[a][1] ] == true) {
			check[ arr[a][0] ] = true;
		}
		

		if( a == arr.length-1) {
			a= 0 ;
			
			dfs(a);
			
		}else {
			dfs(++a);
		}
		
		
	}

	public static int trueCheck() {
		int t = 0 ;
		for(int i = 0 ; i < check.length;i++) {
			if( check[i] == true) {
				t++;
			}
		}
		return t;
	}
}
