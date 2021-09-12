package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManyUseAlphabet {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] alphaCount = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				alphaCount[str.charAt(i) - 65]++;
			} else {
				alphaCount[str.charAt(i) - 97]++;
			}
		}
		
		int max = 0;
		char ch = '?';
		for(int i = 0; i < alphaCount.length; i++) {
			if(alphaCount[i] > max) {
				max = alphaCount[i];
				ch = (char)(65 + i);
			}
			else if(alphaCount[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
	}

}