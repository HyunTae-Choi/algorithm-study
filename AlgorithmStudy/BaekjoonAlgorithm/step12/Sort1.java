package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); 
		int[] testCase = new int[N];
		
		for(int i = 0; i < N; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		
		SortAsc(testCase);
		
		for(int i = 0; i < N; i++) {
			System.out.println(testCase[i]);
		}
		
	}

	private static void SortAsc(int[] testCase) {
		for (int i = 0; i < testCase.length; i++) {
			for (int j = i + 1; j < testCase.length; j++) {
				if (testCase[i] > testCase[j]) {
					int temp = testCase[i];
					testCase[i] = testCase[j];
					testCase[j] = temp;
				}
			}
		}
		
	}

}
