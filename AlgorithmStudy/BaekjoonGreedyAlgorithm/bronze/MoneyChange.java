package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyChange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		int[] testCase = new int[repeat];
		int[] quarter = new int[repeat];
		int[] dime = new int[repeat];
		int[] nickel = new int[repeat];
		int[] penny = new int[repeat];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < repeat; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
			quarter[i] = testCase[i] / 25;
			dime[i] = testCase[i] % 25 / 10;
			nickel[i] = testCase[i] % 25 % 10 / 5;
			penny[i] = testCase[i] % 25 % 10 % 5;
			
			sb.append(quarter[i] + " " + dime[i] + " " + nickel[i] + " " + penny[i] + "\n");
		}
		
		System.out.println(sb);
	}

}
