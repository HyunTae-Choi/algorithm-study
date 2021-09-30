package basic81to90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1087 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int sum = 0;
		int n = 1;
		while(sum < testCase) {
			sum += n;
			n++;
		}
		
		System.out.println(sum);
		
	}

}
