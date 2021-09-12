package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String[] testCase = new String[repeat];
		boolean[] resultCase = new boolean[repeat]; 
		int count = 0;
		
		for(int i = 0; i < repeat; i++) {
			testCase[i] = br.readLine();
			resultCase[i] = wordCheck(testCase[i]);
			if(resultCase[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean wordCheck(String word) {
		boolean[] check = new boolean[26];
		boolean result = false;
		for(int i = 0; i < word.length(); i++) {
			if(check[word.charAt(i) - 97]) {
				if(i > 0) {
					if(word.charAt(i) == word.charAt(i - 1)) {
						result = true;						
					} else {
						return false;
					}
				}
			} else {
				check[word.charAt(i) - 97] = true;
				result = true;
			}
		}
		return result;
	}
}