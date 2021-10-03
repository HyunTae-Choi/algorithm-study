package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		int c = 0;
		if(testCase % 10 == 0) {
			a = testCase / 300;
			b = testCase % 300 / 60;
			c = testCase % 300 % 60 / 10;
			System.out.println(a + " " + b + " " + c);
		} else {
			System.out.println(-1);
		}
	}

}
