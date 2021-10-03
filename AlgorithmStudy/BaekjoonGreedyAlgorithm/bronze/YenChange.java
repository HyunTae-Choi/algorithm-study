package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YenChange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = 1000 - Integer.parseInt(br.readLine());
		
		int a = testCase / 500;
		int b = testCase % 500 / 100;
		int c = testCase % 500 % 100 / 50;
		int d = testCase % 500 % 100 % 50 / 10;
		int e = testCase % 500 % 100 % 50 % 10 / 5;
		int f = testCase % 500 % 100 % 50 % 10 % 5;
		
		System.out.println(a + b + c + d + e + f);
	}

}
