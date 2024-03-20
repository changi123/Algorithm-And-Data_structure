package problem_solving.implement;

import java.util.Scanner;

public class BaekJoon_10988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		if( s.length() == 2 ) {

			if(s.charAt(0) == s.charAt(1)) {				
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			return;
		} else if( s.length() % 2 ==1) {
			for(int i= 0 ; i < s.length(); i++) {

				if( i < s.length() / 2) {					
					sb.append(s.charAt(i));
				} else if ( i> s.length()/2) {
					sb2.append(s.charAt(i));
				}

			}
		} else {
			for(int i= 0 ; i < s.length(); i++) {

				if( i < s.length() / 2) {					
					sb.append(s.charAt(i));
				} else if ( i>= s.length()/2-1) {
					sb2.append(s.charAt(i));
				}

			}
		}
		

		if( sb.toString().equals(sb2.reverse().toString())) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		//		}





	}

}
