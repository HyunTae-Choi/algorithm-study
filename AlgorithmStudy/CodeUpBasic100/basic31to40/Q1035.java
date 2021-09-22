package basic31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1035 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String x = br.readLine();
		int y = Integer.valueOf(x, 16);
		String result = Integer.toOctalString(y);
		
		System.out.println(result);
	}
	
}
