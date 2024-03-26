package problem_solving.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String [][] arr= new String[n][2];
		
		for(int i = 0 ; i <arr.length;i++) {
			
			for(int j = 0 ; j < arr[i].length;j++) {
				arr[i][j] = sc.next(); 
				if( j== 1) {
					
					arr[i][j]= i+arr[i][j];
				}
			}
		}
		
		Arrays.sort(arr, (e1,e2)-> {
			if( e1[0].equals(e2[0]) ) {
				return e1[1].compareTo(e2[1]);
			}else {
				return e1[0].compareTo(e2[0]);
			}                   
		});
		
		
		for(int i = 0 ; i <arr.length;i++) {
			
			for(int j = 0 ; j < arr[i].length;j++) {
				if( j == 1 ) {
					arr[i][j] = arr[i][j].substring(1);
					System.out.println(arr[i][j]);
				}else {					
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
	
	

}
