package problem_solving.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_28014 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;

        String[] input = br.readLine().split(" "); // 입력을 공백을 기준으로 나누기

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(input[i])); // 문자열을 정수로 변환하여 리스트에 추가
        }

        for (int i = 0; i < N; i++) {
            int A = 0;
            int B = 0;

            if (i == N - 1) {
                cnt++;
                break;
            } else {
                A = list.get(0);
                B = list.get(1);
            }

            if (A < B) {
                list.remove(0);
                cnt++;
                continue;
            } else {
                list.remove(0);
                list.remove(0);
                cnt++;

                if (list.size() == 0) {
                    break;
                }

                continue;
            }
        }

        System.out.println(cnt);
	}

}




