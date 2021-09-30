package basic91to100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1092 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] testCase = new int[st.countTokens()];

		for(int i = 0; i < testCase.length; i++) {
			testCase[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(testCase);
		
		int lcm = getLCM(testCase[0], testCase[1]);
		
		for(int i = 2; i < testCase.length; i++) {
			lcm = getLCM(testCase[i], lcm);
		}
		
		System.out.println(lcm);
		
	}

	private static int getLCM(int n, int m) {
		return n * m / getGCD(n, m);
	}

	private static int getGCD(int n, int m) {
		while(n != 0) {
			int r = m % n;
			m = n;
			n = r;
		}
		return m;
	}

}
