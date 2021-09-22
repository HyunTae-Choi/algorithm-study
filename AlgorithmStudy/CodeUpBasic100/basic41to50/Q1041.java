package basic41to50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1041 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		
		System.out.println((char)((int)(testCase.charAt(0)) + 1));
		
	}
	
}
