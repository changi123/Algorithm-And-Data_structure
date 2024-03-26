package problem_solving.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_10610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		String [] arr = s.split("");
//		int [] arrNum = new int[arr.length];
		ArrayList<Long> list= new ArrayList();
		for(int i= 0 ; i < arr.length ; i++) {
			list.add( Long.parseLong(arr[i]));
		}
		
		list.sort(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(int i=  0 ; i <list.size(); i++) {
			sb.append(Long.toString(list.get(i)));
		}
		
		Long n = Long.parseLong(sb.toString());
		while(true) {
			if( n <30 ) {
				System.out.println(-1);
				break;
			}
			if( n % 30== 0) {
				System.out.println(n);
				break;
			}else {
				n = n / 10;
			}
		}

	}

}
