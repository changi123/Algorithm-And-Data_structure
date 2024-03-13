package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_14720 {

	public static void main(String[] args) {
		//		0은 딸기우유만을 파는 가게,
		//		1은 초코우유만을 파는 가게,
		//		2는 바나나우유만을 파는 가게를 뜻하며

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next()); 

		int cnt = 0 ;
		int [] storeArr = new int [N];
		for(int i = 0; i <N ; i++) {
			storeArr[i] = Integer.parseInt( sc.next() );
		}
		int next = 0 ;
		for(int i = 0 ; i < storeArr.length ; i++) {
			
			if( storeArr[i] == 2 && next == 2) {
				cnt++;
				next = 0;
				continue;
			}
			if( storeArr[i] == 1 && next == 1) {
				cnt++ ;
				next=2;
				continue;
			}
			if( storeArr[i] == 0 && next == 0) {
				cnt++;
				next =1 ;
				continue;
			}
		}
		
		
		System.out.print(cnt);
			
	}

}
