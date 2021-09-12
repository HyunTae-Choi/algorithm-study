package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CharRepeat {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String[] testCase = new String[repeat];
		
		StringTokenizer st;
		int charRepeat = 0;
		String charStr = "";
		
		for(int i = 0; i < repeat; i++) {
			testCase[i] = br.readLine();
		}
		
		for(int i = 0; i < repeat; i++) {
			st = new StringTokenizer(testCase[i], " ");
			charRepeat = Integer.parseInt(st.nextToken());
			charStr = st.nextToken();
			repeat(charRepeat, charStr);
		}
		
	}

	private static void repeat(int charRepeat, String charStr) {
		char[] charArr = new char[charStr.length() * charRepeat];
		int arrLocation = 0;
		int count = 0;
		for(int i = 0; i < charStr.length(); i++) {
			while(count < charRepeat) {
				charArr[arrLocation] = charStr.charAt(i);
				count++;
				arrLocation++;
			}
			count = 0;
		}
		
		System.out.println(charArr);
	}

}
