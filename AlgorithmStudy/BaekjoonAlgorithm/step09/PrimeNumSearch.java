package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumSearch {

	private static boolean[] prime;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String numbers = br.readLine();
		StringTokenizer st = new StringTokenizer(numbers, " ");
		int startNum = Integer.parseInt(st.nextToken());
		int endNum = Integer.parseInt(st.nextToken());
		
		prime = new boolean[endNum + 1];
		primeYN();
		
		for(int i = startNum; i <= endNum; i++) {
			if(!prime[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
	}

	private static void primeYN() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
