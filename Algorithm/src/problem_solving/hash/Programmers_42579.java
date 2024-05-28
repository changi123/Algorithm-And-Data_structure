package problem_solving.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Programmers_42579 {

	public static void main(String[] args) {
		String [] genres = {"classic", "pop", "classic", "classic", "pop"};
		int [] plays = {500, 600, 150, 800, 2500};

		System.out.println(Arrays.toString(solution(genres, plays)));

	}
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		HashMap<String,Integer> playHm = new HashMap<>();
		HashMap<String, HashMap<Integer, Integer> >  keyVal= new HashMap<>();

		for(int i = 0 ; i < genres.length;i++) {
			if( !playHm.containsKey(genres[i])) {
				playHm.put(genres[i], plays[i]);
			}else {
				int play = playHm.get(genres[i]);
				playHm.put(genres[i], play+plays[i]);
			}

			if( keyVal.containsKey(genres[i])) {
				HashMap<Integer,Integer> hm= keyVal.get(genres[i]);
				hm.put(i, plays[i]);				
				keyVal.put(genres[i], hm);
			}else {
				HashMap<Integer,Integer> hm= new HashMap<>();
				hm.put(i, plays[i]);
				keyVal.put(genres[i], hm);
			}

		}

		TreeMap<Integer,String> sortPlay = new TreeMap<>(Collections.reverseOrder());
		for(String s : playHm.keySet()) {
			int num = playHm.get(s);
			sortPlay.put(num, s);
		}

        HashMap<String, List<Map.Entry<Integer, Integer>>> sortedKeyVal = new HashMap<>();
        for (String genre : keyVal.keySet()) {
            List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(keyVal.get(genre).entrySet());
            entries.sort((a, b) -> {
                if (b.getValue().equals(a.getValue())) {
                    return a.getKey().compareTo(b.getKey());
                } else {
                    return b.getValue().compareTo(a.getValue());
                }
            });
            sortedKeyVal.put(genre, entries);
        }


        ArrayList<Integer> list = new ArrayList<>();
        for(int num : sortPlay.keySet()) {
        	String g = sortPlay.get(num);
        	List<Entry<Integer, Integer>> m = sortedKeyVal.get(g);
        	int cnt = 0 ;
        	for(int i= 0 ; i < m.size() ; i++) {
        		if( cnt  == 2) {
        			break;
        		}
        		cnt++;
        		list.add(m.get(i).getKey());
        	}
        	
        }
		
        answer = new int[list.size()];
        for(int i= 0 ; i <list.size();i++) {
        	answer[i]=list.get(i);
        }

		return answer;
	}
}
