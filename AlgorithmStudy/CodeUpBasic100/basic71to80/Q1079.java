package basic71to80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1079 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int listCount = st.countTokens();
		String a = "";
		int cnt = 0;
		for(int i = 0; i < listCount; i++) {
			a += st.nextToken();
		}
		
		char[] testCase = new char[listCount];
		for(int i = 0; i < testCase.length; i++) {
			testCase[i] = a.charAt(i);
		}
		
		if(testCase[cnt] != 'q') {
			System.out.println(testCase[cnt]);
			while(testCase[cnt] != 'q') {
				cnt++;
				System.out.println(testCase[cnt]);
			}
		} else {
			System.out.println(testCase[cnt]);
		}
	}
	
}
