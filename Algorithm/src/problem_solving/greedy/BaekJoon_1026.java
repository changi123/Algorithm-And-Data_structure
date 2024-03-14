package problem_solving.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_1026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		
		ArrayList<Integer> alist = new ArrayList<>();
		ArrayList<Integer> blist = new ArrayList<>();
		for(int i= 0; i <N ; i++) {
			alist.add( Integer.parseInt(sc.next()));
		}
		for(int i= 0; i <N ; i++) {
			blist.add( Integer.parseInt(sc.next()));
		}
		
		
		alist.sort(null);
		blist.sort(Collections.reverseOrder());
		
		int sum = 0 ;
		for(int i = 0 ; i <alist.size() ; i++) {
			sum+= alist.get(i)*blist.get(i);
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

}
