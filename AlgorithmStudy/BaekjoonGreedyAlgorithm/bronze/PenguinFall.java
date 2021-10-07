package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PenguinFall {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] testCase = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int pgLocation = 0;
		for(int i = 0; i < count; i++) {
			testCase[i] = Integer.parseInt(st.nextToken());
			if(testCase[i] == -1) {
				pgLocation = i;
			}
		}
		
		if(pgLocation == 1) {
			int min = Integer.MAX_VALUE;
			for(int i = 2; i < count; i++) {
				if(testCase[i] < min) {
					min = testCase[i];
				}
			}
			System.out.println(testCase[0] + min);
		} else if(pgLocation == count - 2) {
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < count - 2; i++) {
				if(testCase[i] < min) {
					min = testCase[i];
				}
			}
			System.out.println(testCase[count - 1] + min);
		} else {
			int min1 = Integer.MAX_VALUE;
			int min2 = Integer.MAX_VALUE;
			for(int i = 0; i < pgLocation; i++) {
				if(testCase[i] < min1) {
					min1 = testCase[i];
				}
			}
			for(int i = pgLocation + 1; i < count; i++) {
				if(testCase[i] < min2) {
					min2 = testCase[i];
				}
			}
			System.out.println(min1 + min2);
		}
	}
}
