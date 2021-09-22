package basic71to80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1075 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		do {
			testCase--;
			System.out.println(testCase);
		} while (testCase > 0);
	}
	
}
