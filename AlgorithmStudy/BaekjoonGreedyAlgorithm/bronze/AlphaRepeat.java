package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AlphaRepeat {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		char[] testCaseArr = new char[testCase.length()];
		int count = 1;
		
		for(int i = 0; i < testCaseArr.length; i++) {
			testCaseArr[i] = testCase.charAt(i);
			if(i > 0) {
				if((int) testCaseArr[i] < (int) testCaseArr[i - 1]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
