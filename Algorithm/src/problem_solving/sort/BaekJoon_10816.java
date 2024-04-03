package problem_solving.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon_10816 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> list = new ArrayList();
		int n = Integer.parseInt(sc.next());
		for(int i = 0 ; i < n ; i++) {
			list.add(sc.nextLong());
		}
		
		int m = Integer.parseInt(sc.next());
		int [] arr = new int [m];
		int j = 0 ; 
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < m ; i ++) {
			Long l = sc.nextLong();
			while(list.contains(l)) {
				arr[j]++;
				list.remove(list.indexOf(l));
			}
			sb.append(arr[j]+" ");
			j++;
		}
		System.out.println(sb.toString());
	}

}
