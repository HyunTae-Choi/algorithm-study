package basic61to70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1068 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		if(testCase >= 90) {
			System.out.println("A");
		} else if(testCase >= 70 && testCase < 90) {
			System.out.println("B");
		} else if(testCase >= 40 && testCase < 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
	}
	
}
