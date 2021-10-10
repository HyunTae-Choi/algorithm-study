package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class APCsubTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count1 = 0;
		int count2 = 0;
		int[][] testCase = new int[N][2];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 2; j++) {
				testCase[i][j] = Integer.parseInt(st.nextToken());
			}
			if(testCase[i][0] <= L) {
				count1++;
				if(testCase[i][1] <= L) {
					count1--;
					count2++;
				}
			}
		}
		int result = 0;
		if(K == 0) {
			System.out.println(result);
		} else {
			if(count2 >= K) {
				result = K * 140;
			} else {
				K = K - count2;
				if(count1 >= K) {
					result = (count2 * 140) + (K * 100);
				} else {
					result = (count2 * 140) + (count1 * 100);
				}
			}
			System.out.println(result);
		}
		
	}

}
