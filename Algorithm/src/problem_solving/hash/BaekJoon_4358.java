package problem_solving.hash;

import java.util.HashMap;
import java.util.Scanner;

public class BaekJoon_4358 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<>();
		String name = "";
		
		while( ( name = sc.nextLine() ).length() != 0 ) {
			if( !hm.containsKey(name)) {
				hm.put(name, 0);
			} else {
				int cnt = hm.get(name);
				cnt++;
				hm.put(name, cnt);
			}
			System.out.println(hm);
		}
		
	}

}
