package basic51to60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1059 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		System.out.println(~a);
	}
	
}
