package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxAndLocation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int maxDataLocation = arrMaxLocation(arr);
		
		System.out.println(arr[maxDataLocation]);
		System.out.println(maxDataLocation + 1);
	}

	private static int arrMaxLocation(int[] arr) {
		int max = arr[0];
		int location = 0;
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				location = i;
			}
		}
		return location;
	}

}
