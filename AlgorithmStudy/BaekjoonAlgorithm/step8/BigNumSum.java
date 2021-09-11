package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigNumSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		if (testCase == 4 || testCase == 7) {
			System.out.println(-1);
		}
		else if (testCase % 5 == 0) {
			System.out.println(testCase / 5);
		}
		else if (testCase % 5 == 1 || testCase % 5 == 3) {
			System.out.println((testCase / 5) + 1);
		}
		else if (testCase % 5 == 2 || testCase % 5 == 4) {
			System.out.println((testCase / 5) + 2);
		}
		
	}

}
