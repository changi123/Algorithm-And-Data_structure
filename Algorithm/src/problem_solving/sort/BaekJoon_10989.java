package problem_solving.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(sc.next());
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		StringBuilder sb = new StringBuilder();
		Arrays.sort(arr);
		for(int i = 0 ; i < n ; i++) {
			sb.append(arr[i]+ "\n");
		}
		
		System.out.println(sb.toString());
		
		
	}

}
