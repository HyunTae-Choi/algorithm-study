package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] times = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
		int result = 0;
		String alphabet = br.readLine();
		char[] alphabetArr = new char[alphabet.length()];
		for(int i = 0; i < alphabet.length(); i++) {
			alphabetArr[i] = alphabet.charAt(i);
			result += times[alphabetArr[i] - 65];
		}
		
		System.out.println(result);
		
	}

}
