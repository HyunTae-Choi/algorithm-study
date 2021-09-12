package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumCount {
	
	private static boolean[] prime;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> testCase = new ArrayList<Integer>();
		int count = 0;
		while(true) {
			count = Integer.parseInt(br.readLine());
			if(count == 0) {
				break;
			}
			testCase.add(count);
		}
		
		for(int i = 0; i < testCase.size(); i++) {
			int result = primeCount(testCase.get(i));
			System.out.println(result);
		}
		
	}

	private static int primeCount(Integer testCase) {
		int startNum = testCase + 1;
		int endNum = testCase * 2;
		int count = 0;
		prime = new boolean[endNum + 1];
		primeYN();
		
		for(int i = startNum; i <= endNum; i++) {
			if(!prime[i]) {
				count++;
			}
		}
		
		return count;
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
