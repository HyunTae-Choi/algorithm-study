package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int[] time = new int[st.countTokens()];
		for(int i = 0; i < st.countTokens(); i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(time[1]);
	}
	
}
