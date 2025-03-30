package problem_solving.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class BaekJoon_11931 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int n = Integer.parseInt(br.readLine());
		
		Integer [] arr = new Integer[n];
		
		StringBuilder sb = new StringBuilder();
		for(int i=  0; i < arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		for (Integer integer : arr) {
			sb.append(integer+""+'\n');
		}
		
		System.out.println(sb.toString());
	}

}
