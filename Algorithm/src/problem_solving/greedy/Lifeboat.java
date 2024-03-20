package problem_solving.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lifeboat {

	public static void main(String[] args) {
	
		int [] people = {10,20,30,40};
//		int [] people = {70, 80, 50};
//		int [] people = {70, 80, 50,50};
		int limit =  100;
		
		System.out.println(solution(people, limit));
		

		
	}
	// 구명보트
    public static int solution(int[] people, int limit) {
    	  int answer = 0;
          
          int minIndex = 0;
          int maxIndex = people.length-1;

          Arrays.sort(people);
   
          int cnt = 0 ;
          int min = people[0];
          for(int i= 0 ; i < people.length;i++) {
        		  if( people[minIndex] + people[maxIndex]<=limit) {
        			  cnt++;
        			  people[minIndex++] = limit+1;
        			  people[maxIndex--] = limit+1;
        		  } else if(people[maxIndex]<=limit ){
        			  people[maxIndex--] = limit+1;
        			  cnt++;
        		  }
        
          }
          
          
          return cnt;
    }

}
