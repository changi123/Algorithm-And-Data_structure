package problem_solving.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String [] arr = new String[n];
		for(int i= 0 ; i  < n ; i++) {
			arr[i] = sc.next();
			
		}
		
		
		Arrays.sort(arr,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if ( s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length() - s2.length();
				}
			}
 		});
		
		
		ArrayList<String> list = new ArrayList<>();
		for(int i= 0 ; i < arr.length;i++) {
			if( !list.contains(arr[i])){
				list.add(arr[i]);
			}
		}
		for(int i= 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	

}
