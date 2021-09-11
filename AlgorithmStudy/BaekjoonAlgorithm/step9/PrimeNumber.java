package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		int[] testCase = new int[repeat];
		String testCaseStr = br.readLine();
		StringTokenizer st = new StringTokenizer(testCaseStr, " ");
		int count = 0;
		for(int i = 0; i < testCase.length; i++) {
			testCase[i] = Integer.parseInt(st.nextToken());
			boolean result = primeNumberSearch(testCase[i]);
			if(result) {
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static boolean primeNumberSearch(int testCase) {
		boolean result = true;
		if(testCase > 1) {
			for(int i = 2; i < testCase; i++) {
				if(testCase == 2) {
					result = true;
				}else if(testCase % i == 0) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		return result;
	}

}
