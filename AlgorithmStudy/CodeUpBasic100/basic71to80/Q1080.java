package basic71to80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1080 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		int result = 1;
		int sum = 0;
		
		while(true) {
			sum += result;
			if(sum >= testCase) {
				break;
			}
			result++;
		}
		System.out.println(result);
	}
	
}
