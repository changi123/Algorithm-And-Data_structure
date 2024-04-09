package Data_structure;

public class Time_Complexity {
	public static void main(String[] args) {
		/*
		  시간복잡도
		  (1) 입력값과 연산 수행 시간의 상관관계를 나타내는 척도를 시간 복잡도라고 한다.

		  Big-O 표기법
		  (1) {10,9,8,7,6...1} 이렇게 배열이 정의 되어 있고
		  	  오름차순 정렬 시 최악의 상황일 때 걸리는 시간을 이용해 나타내는 것
		*/
		
		
		/*
		  (2) O(n)
		   	  ㄴ Linear Time (선형) 
		   	  ㄴ 입력 데이터의 크기에 비례해서 처리 시간이 걸리는 알고리즘이다 
		   	  ㄴ n이 1 늘어날 때마다 처리시간이 1 증가하여 선형적으로 증가한다
		   	  	즉 -> n의 크기만큼 처리시간이 증가
		   	  ㄴ ex)
					int n = 100 ;
					for( int i = 0 ; i < n ; i++) {
						System.out.println(i);
					}
						
			   time		  
			  	  |
	 		  	  |       * 
			  	  |     *
			  	  |   *
			  	  | *
			  	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			  				Data
			  	
		  	
		*/
		
		/*
		  (3) O(1)
		   	  ㄴ Constant Time (상수) 
		   	  ㄴ 입력 데이터 크기에 상관없이 언제나 일정한 시간이 걸리는 알고리즘이다.
		   	  ㄴ 데이터가 증가함에도 성능에는 변함없이 일정함을 나타내고 있다.
		   	  ㄴ ex)
					public boolean constantTime(int[] n ){
						return n[0] == 0 ;
					}
						
			   time		  
			  	  |
	 		  	  |        
			  	  |************     
			  	  |   
			  	  | 
			  	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			  				Data
			  	
		  	
		 */
		
		 
		
		
		
		
	}
}
