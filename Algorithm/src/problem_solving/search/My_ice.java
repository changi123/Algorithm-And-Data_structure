package problem_solving.search;

import java.util.Arrays;
import java.util.Scanner;

public class My_ice {
	public static int [][] board = new int[10][10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		sc.nextLine();
		board = new int[n][m];
		int cnt= 0 ;
		for(int i= 0 ; i< board.length ; i++) {

			String str = sc.nextLine();
			
			for(int j = 0 ; j <board[i].length ; j++) {
				board[i][j] = str.charAt(j)-'0';
			}
		}
		System.out.println(board.length);
		System.out.println(board[0].length);
		for(int i= 0 ; i< board.length ; i++) {
			
			for(int j = 0 ; j <board[i].length ; j++) {
				if( dfs(i,j,board)) {
					
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

	
	public static boolean dfs(int i , int j , int[][] board) {
		
		if( j >=board[0].length|| j<=-1 || i>=board.length || i<=-1 ) {
			return false;
		}
		if( board[i][j] == 0) {
			board[i][j] = 1;
			dfs(i,j+1,board);
			dfs(i,j-1,board);
			dfs(i-1,j,board);
			dfs(i+1,j,board);
			return true;
		}
		return false;
	}
}
