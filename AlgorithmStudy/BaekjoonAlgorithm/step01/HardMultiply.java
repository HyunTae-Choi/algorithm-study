package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HardMultiply {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int x = (b % 100) % 10;
		int y = (b % 100) / 10;
		int z = b / 100;
		
		System.out.println(a * x);
		System.out.println(a * y);
		System.out.println(a * z);
		System.out.println(a * b);
		
	}

}
