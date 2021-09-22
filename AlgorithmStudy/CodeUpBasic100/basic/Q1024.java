package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1024 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println("'" + word.charAt(i) + "'");
		}
		
	}
	
}
