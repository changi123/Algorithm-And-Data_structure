package problem_solving.programmers;

public class Long_jump {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));

	}
	public static long solution(int n) {
		long answer = 0 ;
		if( n %2  == 0 ) {
			answer+= (n-1) + 2;
			return answer%1234567;
		} else {
			answer+= (n-1)  +1;
			return answer%1234567;
		}
	}
}
