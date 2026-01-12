	package problem_solving.dfs_bfs;
	
	public class Progremmers_43165 {
		static int answer  = 0 ;
		public static void main(String[] args) {
			
			int [] numbers = {4, 1, 2, 1};
			int target = 4 ; 
			System.out.println(solution(numbers, target));
			
		}
		  public static int solution(int[] numbers, int target) {
		        // dfs 필요한 것 
		        // 숫자배열, 목표숫자, 인덱스, 최근 합계
		        
		        dfs(numbers, target, 0, 0);
		        return answer;
		    }
		    
		    public static void dfs(int [] numbers, int target, int index , int currentSum){
		        
		        if( index == numbers.length ){
		            if( target == currentSum ){
		                answer ++;
		            }
		            return ; 
		        }
		        dfs(numbers, target , index+1 , currentSum + numbers[index]);
		        dfs(numbers, target , index+1 , currentSum - numbers[index]);
		        
		    }
	
	}
