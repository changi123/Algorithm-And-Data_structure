package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_12933 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		int cnt = 0 ;
		//q','u','a','c','k
		while(true) {
			StringBuilder sb= new StringBuilder();
			
			int len = s.length() ;
			
			
			
			int index1 =s.indexOf("q");
			if( index1 <  0 ) {
				break;
			}
			sb.append(s.charAt(index1));
			s = s.replaceFirst("q", "_");
			
			int index2 =s.indexOf("u");
			if( index2 <  0 || index2 < index1 ) {
				break;
			}
			sb.append(s.charAt(index2));
			s = s.replaceFirst("u", "_");
			
			int index3 =s.indexOf("a");
			if( index3 <  0 || index3 < index2) {
				break;
			}
			sb.append(s.charAt(index3));
			s = s.replaceFirst("a", "_");
			
			int index4 =s.indexOf("c");
			if( index4 <  0 || index4 < index3) {
				break;
			}
			sb.append(s.charAt(index4));
			s = s.replaceFirst("c", "_");
			
			
			int index5 =s.indexOf("k");
			if( index5 <  0 || index5 < index4) {
				break;
			}
			sb.append(s.charAt(index5));
			s = s.replaceFirst("k", "_");
			
			if( sb.toString().equals("quack")) {
				cnt++;
				
			}
			
			
		}
		System.out.println(cnt);
		
	}

}
