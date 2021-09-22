package basic71to80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1076 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		char c = testCase.charAt(0);
		
		for(int i = 97; i <= (int)c; i++) {
			if(i < (int)c) {
				System.out.print((char)i + " ");
			} else {
				System.out.print((char)i);
			}
		}
	}
	
}
