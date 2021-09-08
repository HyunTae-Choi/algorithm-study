package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetLocation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		char[] wordSplit = new char[word.length()];
		int[] alphaArr = new int[26];
		
		for(int i = 0; i < alphaArr.length; i++) {
			alphaArr[i] = -1;
		}
		
		for(int i = 0; i < wordSplit.length; i++) {
			wordSplit[i] = word.charAt(i);
		}
		
		for(int i = 0; i < wordSplit.length; i++) {
			int location = wordSplit[i] - 'a';
			if(alphaArr[location] == -1) {
				alphaArr[location] = i;
			}
		}
		
		for(int i = 0; i < alphaArr.length; i++) {
			if(i < alphaArr.length - 1) {
				System.out.print(alphaArr[i] + " ");
			} else {
				System.out.print(alphaArr[i]);
			}
		}
		
	}

}
