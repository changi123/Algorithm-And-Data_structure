package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_14720 {

	public static void main(String[] args) {
		//		0은 딸기우유만을 파는 가게,
		//		1은 초코우유만을 파는 가게,
		//		2는 바나나우유만을 파는 가게를 뜻하며

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next()); 

		int cnt = 0 ;
		int [] storeArr = new int [N];
		String sol = "012";
		String s= "";
		for(int i = 0; i <N ; i++) {
			s+= sc.next();
		}
		
		int len = s.length();
		while(len >= 3) {
			s = s.replaceFirst(sol, "");
			if( len != s.length()) {
				cnt++;
				len = s.length();
			}
		}
		
		
			
	}

}
