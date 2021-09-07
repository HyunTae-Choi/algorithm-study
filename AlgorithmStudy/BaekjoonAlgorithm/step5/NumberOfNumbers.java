package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberOfNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int result = a * b * c;
		int[] numArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		NumOfNumbers(numArr, result);
		
		for(int numArrData : numArr) {
			System.out.println(numArrData);
		}
	}

	private static void NumOfNumbers(int[] numArr, int result) {
		while(result > 0) {
			int numArrData = result % 10;
			numArr[numArrData]++;
			result = result / 10;
		}
	}
}
