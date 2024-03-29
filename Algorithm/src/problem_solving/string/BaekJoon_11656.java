package problem_solving.string;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_11656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = 0 ;
		ArrayList<String> list = new ArrayList();
		while(i < s.length()) {
			String sr = s.substring(i);
			list.add(sr);
			i++;
			
		}
		
		list.sort(null);
		
		for(String slist : list) {
			System.out.println(slist);
		}
	}

}
