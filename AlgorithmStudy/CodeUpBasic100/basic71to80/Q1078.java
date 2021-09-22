package basic71to80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1078 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 1; i <= testCase; i++) {
			if(i % 2 == 0) {
				sum += i;
			} else {
				continue;
			}
		}
		
		System.out.println(sum);
	}
	
}
