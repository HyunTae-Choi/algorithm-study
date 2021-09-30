package basic81to90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1088 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= testCase; i++) {
			if(i % 3 == 0) {
				continue;
			}
			sb.append(i + " ");
		}
		
		System.out.println(sb);
		
	}

}
