package problem_solving.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon_1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		HashSet<String> hs = new HashSet<>();
		for(int i= 0 ; i < n ;i++) {
			hs.add(sc.next());
		}

		ArrayList<String> list = new ArrayList();

		for(int i= 0 ; i < m ;i++) {
			String s = sc.next();
			if(hs.contains(s)) {
				list.add(s);
			}
		}


		list.sort(null);
		System.out.println(list.size());
		for(int i= 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}









	}

}
