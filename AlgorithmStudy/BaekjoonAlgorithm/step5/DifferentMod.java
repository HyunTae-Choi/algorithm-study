package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifferentMod {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] modArr = new int[10];
		int count = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			modArr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		for(int i = 0; i < 10; i++) {
			count = 0;
			for(int j = i + 1; j < 10; j++) {
				if(modArr[i] == modArr[j]) {
					count++;
				}
			}
			if(count == 0) {
				result++;
			}
		}
		System.out.println(result);
	}

}
