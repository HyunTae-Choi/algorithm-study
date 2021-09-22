package basic31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1033 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		String result = Integer.toHexString(x);
		
		System.out.println(result.toUpperCase());
	}
	
}
