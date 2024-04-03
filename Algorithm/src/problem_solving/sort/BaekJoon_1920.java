package problem_solving.sort;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon_1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Set<Long> set = new HashSet<>();
		for(int i= 0 ; i< n ; i++) {
			set.add(sc.nextLong());
		}
		int m = Integer.parseInt(sc.next());
		
		for(int i= 0 ; i < m ; i ++) {
			Long l = sc.nextLong();
			if( !set.contains(l)) {
				System.out.println(0);
			}else {
				System.out.println(1);
			}
		}
		
		
	}

}
