package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZOAC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		char[] testCaseArr = new char[testCase.length() + 1];
		testCaseArr[0] = 'A';
		for(int i = 1; i < testCaseArr.length; i++) {
			testCaseArr[i] = testCase.charAt(i - 1);
		}
		int length = 0;
		for(int i = 0; i < testCaseArr.length - 1; i++) {
			length += countLength(testCaseArr[i], testCaseArr[i + 1]);
		}
		
		System.out.println(length);
		
	}

	private static int countLength(char a, char b) {
		return Math.abs(a - b) > 26 - Math.abs(a - b) ? 26 - Math.abs(a - b) : Math.abs(a - b);
	}

}