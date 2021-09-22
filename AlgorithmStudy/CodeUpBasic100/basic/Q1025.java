package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1025 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int a = x / 10000 * 10000;
		int b = (x % 10000) / 1000 * 1000;
		int c = (x % 1000) / 100 * 100;
		int d = (x % 100) / 10 * 10;
		int e = x % 10;
		
		System.out.println("[" + a + "]");
		System.out.println("[" + b + "]");
		System.out.println("[" + c + "]");
		System.out.println("[" + d + "]");
		System.out.println("[" + e + "]");
	}
	
}
