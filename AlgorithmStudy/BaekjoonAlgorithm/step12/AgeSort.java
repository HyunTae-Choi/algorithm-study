package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class AgeSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int repeat = Integer.parseInt(br.readLine());
		String[][] testCase = new String[repeat][3];
		
		for(int i = 0; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 3; j++) {
				if(j == 0) {
					testCase[i][j] = String.valueOf(i);
				} else {
					testCase[i][j] = st.nextToken();
				}
			}
		}
		Arrays.sort(testCase, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])) {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				} else {
					return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < repeat; i++) {
			sb.append(testCase[i][1] + " " + testCase[i][2]).append('\n');
		}
		System.out.println(sb);
	}

}
