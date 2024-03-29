package problem_solving.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon_14425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int cnt = 0 ;
		Set<String> hs = new HashSet();
		for(int i= 0 ; i < n ; i++) {
			hs.add(sc.next());
		}
	
		for(int i=  0 ; i < m ; i++) {
			String s = sc.next();
			if(hs.contains(s)) {
				cnt++;
			}
		}
	
		System.out.println(cnt);
		
		
	}

}
