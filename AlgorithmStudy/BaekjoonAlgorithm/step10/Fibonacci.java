package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		System.out.println(fibo(testCase));

	}

	private static int fibo(int testCase) {
		if(testCase <= 1) {
			return testCase;
		}
		return fibo(testCase - 2) + fibo(testCase - 1);
	}

}
