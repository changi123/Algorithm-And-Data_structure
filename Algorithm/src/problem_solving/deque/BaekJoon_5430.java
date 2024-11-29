package problem_solving.deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BaekJoon_5430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-- > 0) {
			StringBuilder sb = new StringBuilder();
			String s1 = sc.next(); // RDD
			int n = Integer.parseInt(sc.next()); // 4
			Deque<Integer> dqS = new ArrayDeque<>();
			String s2 = sc.next(); // [1,2,3,4]
			s2 = s2.substring(1);
			s2 = s2.substring(0,s2.length()-1);
			String [] arr = s2.split(","); // 숫자만 들어가게 
			String [] acArr = s1.split(""); // [R,D,D]
			
			
			int Dcnt = 0 ;
			for(int i = 0 ; i < acArr.length ; i ++) {
				if(acArr[i].equals("D")) {
					Dcnt++;
				}
			}
			if( arr.length== 1 && Dcnt > 0) {
				System.out.println("error");
				continue;
			}
		
			for(int i= 0 ; i < arr.length;i++) {
				if( i == arr.length-1 ) {					
					dqS.add(Integer.parseInt(arr[i]));
					sb.append(Integer.parseInt(arr[i]));
				} else {
					dqS.add(Integer.parseInt(arr[i]));
					sb.append(Integer.parseInt(arr[i])+",");
				}
			}
			for(int i = 0  ; i < acArr.length ; i++) {
				if( acArr[i].equals("R")) {
					sb = sb.reverse();
				} else {
					if( dqS.isEmpty()) {
						System.out.println("error");
						break;
					} else {						
						dqS.pollFirst();
						String [] newArr1 = sb.toString().split(",");
						sb.delete(0, sb.length());
						for(int j = 1 ; j < newArr1.length;j++) {
							if( j == 1 ) {
								if( newArr1.length > 1) {									
									sb.append(newArr1[j]+",");
								} else {
									sb.append(newArr1[j]);									
								}
								continue;
							} else if( j== newArr1.length-1){
								sb.append(newArr1[j]);
								continue;
							}
							sb.append(newArr1[j]+",");
						}
						String [] newArr2 = sb.toString().split(",");
						dqS.clear();
						for(int j = 0 ; j < newArr2.length;j++) {
							dqS.add(Integer.parseInt(newArr2[j]));
						}
						
					}
				}
			}
			
			while(!dqS.isEmpty()) {
				System.out.print(dqS.poll());
			}


		}	
	}

}
