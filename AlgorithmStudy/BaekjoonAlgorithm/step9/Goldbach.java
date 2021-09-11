package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Goldbach {
	
	private static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		int[] testCase = new int[repeat];
		
		primeYN();
		
		for(int i = 0; i < testCase.length; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < testCase.length; i++) {
			GoldbachConjecture(testCase[i]);
		}
		
	}

	private static void GoldbachConjecture(int testCase) {
		int part1 = testCase / 2;
		int part2 = testCase / 2;
		
		if(prime[part1] && prime[part2]) {
			while(prime[part1] || prime[part2]) {
				part1--;
				part2++;
			}
		}
		System.out.println(part1 + " " + part2);
		
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
