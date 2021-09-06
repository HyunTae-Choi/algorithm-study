package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str);
		
		for(int i = 1; i < 10; i++) {
			int result = a * i;
			System.out.println(a + " * " + i + " = " + result);
		}
		
	}

}
