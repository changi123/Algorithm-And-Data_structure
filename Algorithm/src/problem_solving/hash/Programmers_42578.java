package problem_solving.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Programmers_42578 {

	public static void main(String[] args) {
		String [][] clothes = {
				{"yellow_hat", "headgear"},
				{"blue_sunglasses", "eyewear"}, 
				{"green_turban", "headgear"}
		};

		System.out.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 0;
		Set<String> set = new HashSet<>();
		int cnt = 0;
		for(int i = 0 ; i < clothes.length;i++) {
			set.add(clothes[i][0]);
		}
		
		System.out.println(set.toString());
		for(int i= 0 ; i< clothes.length ; i++) {
			String clotheType = clothes[i][1];
			StringBuilder sb = new StringBuilder(clothes[i][0]);
			for(int j = i ; j < clothes.length;j++) {
				if( !clothes[j][1].equals(clotheType)) {
					sb.append(clothes[j][0]);
					set.add(sb.toString());
				}
			}
		}

		return set.size();
	}
}
