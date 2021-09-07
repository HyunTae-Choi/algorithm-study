package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinAndMax {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrLength = Integer.parseInt(br.readLine());
		int[] arr = new int[arrLength];
		String arrDataStr = br.readLine();
		StringTokenizer arrDataSt = new StringTokenizer(arrDataStr, " ");
		for(int i = 0; i < arrLength; i++) {
			arr[i] = Integer.parseInt(arrDataSt.nextToken());
		}
		int maxData = arrMax(arr);
		int minData = arrMin(arr);
		
		System.out.println(minData + " " + maxData);
	}

	private static int arrMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				int temp = arr[i];
				arr[i] = max;
				max = temp;
			}
		}
		return max;
	}
	
	private static int arrMin(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				int temp = arr[i];
				arr[i] = min;
				min = temp;
			}
		}
		return min;
	}

}
