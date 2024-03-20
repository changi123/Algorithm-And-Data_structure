package problem_solving.greedy;

public class BigNum_make {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String number = "99999999";
//		String number = "987654321";
//		String number = "4177252841";
		String number = "1231234";
//		int k = 4;
//		int k = 5;
		int k = 3;

		System.out.println(solution(number, k));
	}
	public static String solution(String number, int k) {
		  StringBuilder answer = new StringBuilder(number);
			int i = 0; 
			while( k >0) {
				
				
				if(i== number.length()-1) {
					if( k >0 ) {
						number = number.substring(0,number.length() -k);
					}
					break;
				}
				char f = answer.charAt(i);
				char b = answer.charAt(i+1);
				
				if( f >= '9') {
					i++;
					continue;
				}
			
				if( f < b) {
					answer.deleteCharAt(i);
//					i++;
					k--;
					i= 0 ;
				} else {
					i++;
				}
				
			}
			
			
			

			return answer.toString();
	}
}
