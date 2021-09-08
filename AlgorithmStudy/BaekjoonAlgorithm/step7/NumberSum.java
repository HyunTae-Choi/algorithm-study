package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String numberStr = br.readLine();
		char[] a = new char[length];
		int sum = 0;
		for(int i = 0; i < length; i++) {
			a[i] = numberStr.charAt(i);
			sum += a[i] - '0';
		}
		
		System.out.println(sum);
		
	}

}
