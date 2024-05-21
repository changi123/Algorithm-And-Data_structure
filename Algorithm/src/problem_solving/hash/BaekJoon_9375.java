package problem_solving.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_9375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		while(T-- > 0 ) {
			HashMap<String,ArrayList<String>> hm = new HashMap<>();
			int n = Integer.parseInt(sc.next());
			for(int i= 0 ; i < n ; i++) {
				String s = sc.next();
				String type = sc.next();
				ArrayList<String> list = new ArrayList();
				list.add(s);
				if( !hm.containsKey(type)) {					
					hm.put(type, list);
				} else {
					ArrayList<String> clo = hm.get(type);
					clo.add(s);
					hm.put(type, clo);
				}
			}
			if( hm.size() == 1) {
				for(String s : hm.keySet()) {
					System.out.println(hm.get(s).size());
				}
				return ; 
			}
			System.out.println(hm.toString());
		}
		
	}

}
