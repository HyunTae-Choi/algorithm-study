package basic31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1034 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String x = br.readLine();
		int result = Integer.valueOf(x, 8);
		
		System.out.println(result);
	}
	
}
