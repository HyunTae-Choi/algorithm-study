package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoneyComb {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		int count = 1;
		int range = 2;
		
		if(testCase == 1) {
			System.out.println(count);
		} else {
			while(range <= testCase) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
		
	}

}
