package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int[] a = new int[length];
		
		for(int i = 0; i < length; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		long sum = sum(a);
		
		System.out.println(sum);
	}

	private static long sum(int[] a) {
		long sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
