package problem_solving.stack;

import java.util.Arrays;
import java.util.Stack;

public class Programmers_42584 {

	public static void main(String[] args) {
		int [] prices = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution(prices)));
		
	}
    public static int[] solution(int[] prices) {
    	int[] answer = new int[prices.length];
        for(int i = 0 ; i < prices.length;i++) {
        	int basic = prices[i];
        	
        	for(int j = i+1 ; j< prices.length;j++) {
        		
        		int compare = prices[j];
        		if( basic <= compare) {
        			answer[i]++;
        		}else {
        			answer[i]++;
        			break;
        		}
        		
        	}
        }
        return answer;
    }
}
