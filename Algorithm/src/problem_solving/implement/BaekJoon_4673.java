package problem_solving.implement;

public class BaekJoon_4673 {

	public static void main(String[] args) {
		
		
		
		
		boolean [] flag = new boolean[10001];
		for(int i = 0 ; i  <10001 ;i++) {
			int n = d(i);
			if( n <10001) {				
				flag[n] = true;
			} 

		}
		
		
		for(int i= 0 ; i < flag.length;i++) {
			if( !flag[i] ) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int num) {
		int sum = num ;
		while(num !=0) {
			sum += num % 10 ;
			num = num / 10;
		}
		return sum;
	}

}
