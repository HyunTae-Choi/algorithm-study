package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1017 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 3; i++) {
			if(i == 2) {
				System.out.print(x);
			} else {
				System.out.print(x + " ");
			}
		}
	}
	
}
