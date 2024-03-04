package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 구명보트 {

	public static void main(String[] args) {
	
		int [] people = {70, 50, 80, 50};
//		int [] people = {70, 80, 50};
		int limit =  100;
		
		System.out.println(solution(people, limit));
		

		
	}
	// 구명보트
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        for(int i = 0; i < people.length ; i ++) {
//        	int max = people [people.length-i-1];
        	
        	
        	for(int j = 0 ; j < people.length;j++) {
        	
        		if(  people [people.length-i-1] + people[j] <= limit) {
        			answer++;
        			people [people.length-i-1] = limit+1;
        			people[j] = limit+1;
        		}
        			
        	}
        	if( people [people.length-i-1]  <=limit) {
        		answer++;
        	}
        	
        	
        }
        return answer;
    }

}
