package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1015 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double x = Double.parseDouble(br.readLine());
		double y = Math.round(x * 100) / 100.0;
		System.out.println(y);
	}
	
}
