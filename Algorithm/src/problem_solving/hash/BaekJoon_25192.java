package problem_solving.hash;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon_25192 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int answer = 0 ;
		HashSet<String> hs = new HashSet<>();
		for(int i= 0 ; i < n ; i++) {			
			String s = sc.next();
			if( s.equals("ENTER")) {
				hs = new HashSet<>();
				continue;
			}
			
			if( !hs.contains(s)) {
				hs.add(s);
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}

}
