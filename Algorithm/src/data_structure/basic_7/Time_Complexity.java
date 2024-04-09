package data_structure.basic_7;

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
		
		
		/*
		  (4) O(n^2)
		   	  ㄴ Quadratic Time (이차) 
			  ㄴ 입력 데이터 n 만큼 반복하는데, 그안에서 n 만큼 또 반복할 때의 표기 방법이다.
			  ㄴ 데이터가 적을 때는 문제없지만 많아질수록 수직 상승!한다
		   	  ㄴ ex)
					public void quadraticTime(int[] n ){
						for(int i= 0 ; i < n.length ; i++){
							for(int j = 0 ; j < n.length;j++){
								System.out.println(i+j);
							}
						} 
					}
						
			   time		  
			  	  |  		*
	 		  	  |        * 
			  	  |      *
			  	  |    *   
			  	  |* 
			  	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			  				Data
			  	
		  	-> 어느 수간부터 수직상승 한다
		 */
		
		 
		/*
		  (5) O(nm)
		   	  ㄴ Quadratic Time (이차) 
			  ㄴ 바로 위 O(n^2) 와 비슷하지만 다르다. n*n 이 아닌 n*m -> n과 m이 다른경우
			  
			  ㄴ 데이터가 적을 때는 문제없지만 많아질수록 수직 상승!한다
		   	  ㄴ ex) 
					public void quadraticTime(int[] n ){
						for(int i= 0 ; i < n.length ; i++){
							for(int j = 0 ; j < m.length;j++){
								System.out.println(i+j);
							}
						} 
					}
						
			   time		  
			  	  |  		
	 		  	  |    m과 n에 따라서    
			  	  |    그래프가 달라진다 
			  	  |       
			  	  | 
			  	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			  				Data
			  	
		  	
		 */
		
		
		
		/*
		  (6) O(2^n)
		   	  ㄴ Exponential Time 
			  ㄴ 피보나치 수열로 비유할 수 있다.
		   	  ㄴ 그림부터 그려보자 -> 1에서 시작해서 한 면을 기준으로
		   	  	정사각형을 만드는 것이다.
		   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		   |3| 2 |		|
		   | |1|1|		|
		   ㅡㅡㅡㅡㅡ		|
		   |     |		|
		   |	 |	8	|
		   |  5	 |		|
		   |	 |		|
		   |	 |		|
		   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		   wow...............................한 번에 이해....
		   0+1 = 1
		   1+1 = 2
		   1+2 = 3
		   2+3 = 5
		   3+5 = 8
		   :
		   :
		   
		   ex1) 
		   public int fibonacci(int n , int[] r) {
			   	if( n <=0) {
			   		return 0 ;
			   	} else if( n == 1){
			   		return r[n] = 1;
			   	} else{
			   		return r[n] = fibonacci( n-1, r) + fibonacci(n-2, r) ;
			   	}
		   	}
		   	
		   	ex2)
		    public int fibonacci(int n) {
			   	if( n <=1) {
			   		return n ;
			   	} else{
			   		return fibonacci( n-1) + fibonacci(n-2) ;
			   	}
		   	}
		   	
		   	
		   정리
		   (1) 매번 함수가 호출될 때마다 2번 씩 호출하게 된다. -> 트리구조를 뜻한다.
		   (2) 이 호출하는 횟수는 트리의 높이만큼 반복된다. 따라서 O(2^n) 의 시간 복잡도를 가지게 된다
		   
		 */
		
		/*
		  (6) O(log n)
		   	  ㄴ binary search ( 이진 탐색 )
			  ㄴ 조건을 좁히기 때문에 순차 검색O(n) 보다 훨씬 빠르다
			  ㄴ	데이터가 증가해도 크게 성능이 차이나지 않는다 -> 이거보니까 시간초과 뜨는 문제들 이진탐색으로
			   	풀어보면 될듯? 하다
		   	  
			   time		  
			  	  |  		
	 		  	  |    					*
			  	  |  			*
			  	  | 	*	      
			  	  |* 
			  	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			  				Data
			  	
		  	
		 */
		
		
	}
}
