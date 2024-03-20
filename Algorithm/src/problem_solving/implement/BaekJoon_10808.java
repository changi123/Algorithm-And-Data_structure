package problem_solving.implement;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int [] arr = new int [26];
		
		for(int i = 0 ; i <s.length();i++) {
			char c = s.charAt(i);
			arr[c-97]++;
		}
		
		for(int i= 0 ; i <arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
