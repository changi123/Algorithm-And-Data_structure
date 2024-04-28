package problem_solving.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon_2606 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int cou = Integer.parseInt(sc.next());
		int [][] arr = new int[cou][2];
		
		boolean[] check = new boolean[n+1];
		for(int i= 0 ; i < arr.length;i++) {
			for(int j = 0 ; j < arr[0].length;j++) {
				arr[i][j] = Integer.parseInt(sc.next());
			}
		}
		check[0] = true;
		for(int i = 0 ; i  <cou ; i++) {
			
			if( arr[i][0] == 1) {
				check[arr[i][1]] =true;
				continue;
			}
			
			if( check[arr[i][1]] == true) {
				check[arr[i][0]] = true;
				continue;
			}
			if( check[arr[i][0]] == true) {
				check[arr[i][1]] = true;
				continue;
			}
			
			if( arr[i][1] == 1) {
				check[arr[i][0]] =true;
				arr[i][1] = 0 ;
				i = 0;
				continue;
			}
		
	
		}
		int cnt = 0 ;
		for(int i= 0 ; i < check.length; i++) {
			if (check[i] == true) {
				cnt++;
			}
		}

		System.out.println(cnt-1);
	}

}
