package basic81to90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1082 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 15; i++) {
			sb.append(testCase + "*" + Integer.toHexString(i).toUpperCase() + "=" + Integer.toHexString(Integer.parseInt(testCase, 16) * i).toUpperCase() + "\n");
		}
		System.out.println(sb);
	}

}
