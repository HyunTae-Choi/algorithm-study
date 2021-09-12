package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifferentMod {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] modArr = new int[10];
		boolean[] modOverlap = new boolean[42];
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			modArr[i] = Integer.parseInt(br.readLine()) % 42;
			modOverlap[modArr[i]] = true;
		}
		for(boolean count : modOverlap) {
			if(count) {
				result++;
			} else {
				continue;
			}
		}
		
		System.out.println(result);
	}

}
