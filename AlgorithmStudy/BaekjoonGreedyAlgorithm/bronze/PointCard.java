package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PointCard {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int max = Integer.MIN_VALUE;
		int except = 0;
		int[][] testCase = new int[m][2];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 2; j++) {
				testCase[i][j] = Integer.parseInt(st.nextToken());
			}
			if(n - testCase[i][0] > max) {
				max = n - testCase[i][0];
				except = i;
			}
		}
		
		int result = 0;
		for(int i = 0; i < m; i++) {
			if(i == except || testCase[i][0] >= n) {
				continue;
			} else if(testCase[i][0] < n) {
				result += n - testCase[i][0];
			}
		}
		System.out.println(result);

	}

}
