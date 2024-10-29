package problem_solving.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_2170 {

	public static void main(String[] args) throws IOException {

		
//		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(sc.next());
//		int [][] arr = new int[n][2];
//		
//		for(int i =0  ; i < arr.length;i++) {
//			for(int j =  0 ; j < arr[0].length;j++) {
//				
//				arr[i][j] = Integer.parseInt(sc.next());
//			}
//		}
//
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
		Arrays.sort(arr, (a1,a2)-> {
			if( a1[0] == a2[0] ) {
				return a1[1]-a2[1];
			} else{
				return a1[0] - a2[0];
			}
		});
		
		int max = arr[0][1] ; 
		int min = arr[0][0] ;
		int sum = max - min  ;
		int i = 1 ;  
		while(i < n ) {
			
			if( arr[i][1] <= max && arr[i][0] >= min) {
				i++;
				continue;
			} else if( arr[i][0] < max ) {
				sum+= arr[i][1] -max ; 
			} else {
				sum+= arr[i][1]- arr[i][0];
			}
			max = arr[i][1];
			min = arr[i][0];
			i++;
			
		}
		System.out.println(sum);
	}

}
