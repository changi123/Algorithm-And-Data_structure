package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class 큰수만들기 {

	public static void main(String[] args) {
//		String number = "4177252841";
		String number = "1924";
		
		int k = 2 ;
		
		System.out.println(solution(number, k));

	}
    public static String solution(String number, int k) {
        String answer = "";
        String[] arr = number.split("");
       
        int cnt = 0 ;
        for(int i= 0 ; i  <number.length(); i++) {
        	if( cnt == k) {
        		
        		if( i==  arr.length-2) {
        			answer+=(arr[i+1]);
        			break;
        		} else {
        			answer+=(arr[i+1]);
        				
        			
        		}
        		continue;
        	}
        	int front = Integer.parseInt(arr[i]);
        	int back = Integer.parseInt(arr[i+1]);
        	
        	int max = Math.max(front, back);
        	
        	System.out.println(max);
        	System.out.println(back);
        	if( max <= back) {        		
        		answer += Integer.toString(max);
        		cnt++;
        	}
        	System.out.println(answer);

        }
        return answer;
    }
}
