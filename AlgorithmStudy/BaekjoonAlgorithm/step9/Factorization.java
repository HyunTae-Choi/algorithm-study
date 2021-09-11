package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 2; i <= testCase; i++) {
			while(testCase % i == 0) {
				System.out.println(i);
				testCase = testCase / i;
			}
		}
		
	}

}
