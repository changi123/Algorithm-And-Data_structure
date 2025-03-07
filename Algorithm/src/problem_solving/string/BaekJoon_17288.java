package problem_solving.string;

import java.util.Scanner;

public class BaekJoon_17288 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int cnt = 0 ;
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		for(int i = 1 ; i< s.length();i++) {
			if( s.charAt(i-1) ==  s.charAt(i)-1 || sb.length()==0) {
				sb.append(s.charAt(i));
			} else {
				if( sb.length() == 3 ) {
					cnt++;
					sb = new StringBuilder();
					sb.append(s.charAt(i));
				}  else if( sb.length() > 3 ) {
					sb = new StringBuilder();
					sb.append(s.charAt(i));
				}
			}
		}
		if( sb.length() == 3  ) {
			System.out.println(cnt+1);
		} else {
			System.out.println(cnt);
		}
	}

}
