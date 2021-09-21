package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class CoordinateSort2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int repeat = Integer.parseInt(br.readLine());
		int[][] testCase = new int[repeat][2];
		
		for(int i = 0; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j >= 0; j--) {
				testCase[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(testCase, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< repeat ; i++) {
			// 위치 주의
			sb.append(testCase[i][1] + " " + testCase[i][0]).append('\n');
		}
		System.out.println(sb);
	}

}
