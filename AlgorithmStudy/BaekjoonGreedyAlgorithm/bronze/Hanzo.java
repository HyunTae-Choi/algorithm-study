package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hanzo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] testCase = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < count; i++) {
			testCase[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int result = 0;
		for(int i = 0; i < count; i++) {
			for(int j = i + 1; j < count; j++) {
				if(testCase[i] > testCase[j]) {
					result++;					
				} else {
					break;
				}
			}
			if(max < result) {
				max = result;
			}
			result = 0;
		}
		
		System.out.println(max);

	}

}
