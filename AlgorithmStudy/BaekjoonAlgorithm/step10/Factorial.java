package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		System.out.println(fact(testCase));

	}

	private static int fact(int testCase) {
		if(testCase <= 1) {
			return 1;
		}
		return fact(testCase - 1) * testCase;
	}

}
