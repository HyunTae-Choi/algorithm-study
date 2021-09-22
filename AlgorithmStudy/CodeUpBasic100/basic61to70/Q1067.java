package basic61to70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1067 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		if(testCase > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
		
		if(Math.abs(testCase) % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
	}
	
}
