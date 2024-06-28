package problem_solving.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class Programmers_42746 {

	public static void main(String[] args) {
		int [] numbers = {979, 97, 978, 81, 818, 817};
		System.out.println(solution(numbers));
	}
	public static String solution(int[] numbers) {
		String answer = "";
		String [] arr = new String [numbers.length];

		for(int i= 0 ; i < arr.length;i++) {
			arr[i] = Integer.toString(numbers[i]);
		}


		Arrays.sort(arr, (a1,a2) -> {
			int len = Integer.compare(a1.length(), a2.length());
		
			if( len == 0) {
				return a1.compareTo(a2);
			}else if( len > 0 ){
				return a2.length();
			} else  {
				return a1.length();
			}
		});
		


		Queue<Integer> q = new LinkedList<Integer>();

		for(String s : arr) {
			q.offer(Integer.parseInt(s));

		}
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()) {
			if( q.size() == 1) {
				sb.append(q.poll());
				break;
			}
			StringBuilder sb1 = new StringBuilder();
			sb1.append(q.poll());
			StringBuilder sb2 = new StringBuilder();
			sb2.append(q.poll());

			StringBuilder sb3 = new StringBuilder(sb1.toString());

			StringBuilder compare1 =sb1.append(sb2);
			StringBuilder compare2 =sb2.append(sb3);
			if ( Integer.parseInt(compare1.toString()) > Integer.parseInt(compare2.toString()) ){
				sb.append(compare1);
			} else {
				sb.append(compare2);
			}
		}

		// System.out.println(sb.toString());
		return sb.toString();

	}
}
