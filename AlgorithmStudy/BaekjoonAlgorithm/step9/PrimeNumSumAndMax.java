package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumSumAndMax {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int startNum = Integer.parseInt(br.readLine());
		int endNum = Integer.parseInt(br.readLine());
		int[] primeNumbers = new int[endNum - startNum + 1];
		int count = 0;
		int sum = 0;
		for(int i = startNum; i <= endNum; i++) {
			boolean result = primeNumberSearch(i);
			if(result) {
				count++;
				primeNumbers[count-1] = i;
			}
		}
		for(int i = 0; i < primeNumbers.length; i++) {
			sum += primeNumbers[i]; 
		}
		if(sum > 0) {
			System.out.println(sum);
			System.out.println(primeNumbers[0]);
		} else {
			System.out.println(-1);
		}
	}

	private static boolean primeNumberSearch(int testCase) {
		boolean result = true;
		if(testCase > 1) {
			for(int i = 2; i < testCase; i++) {
				if(testCase == 2) {
					result = true;
				}else if(testCase % i == 0) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		return result;
	}

}
