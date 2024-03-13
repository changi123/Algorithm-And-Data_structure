package problem_solving.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_28014 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  
	        int N = Integer.parseInt(br.readLine());

	        Queue<Integer> queue = new LinkedList();
	        int cnt = 0;
	        String[] inputNumbers = br.readLine().split(" ");

	        // 입력 받은 숫자들을 정수로 변환하여 큐에 추가
	        for (String numStr : inputNumbers) {
	            queue.offer(Integer.parseInt(numStr));
	        }
	    
	        while (!queue.isEmpty()) {
	            int A = queue.poll();
	            cnt++;

	            if (!queue.isEmpty()) {
	                int B = queue.peek();

	                if (A >= B) {
	                    queue.poll();
	                }
	            }
	        }

	        System.out.println(cnt);
	}

}




