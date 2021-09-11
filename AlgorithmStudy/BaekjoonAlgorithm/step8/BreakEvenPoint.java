package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		StringTokenizer st = new StringTokenizer(word, " ");
		int[] testCase = new int[3];
		for(int i = 0; i < 3; i++) {
			testCase[i] = Integer.parseInt(st.nextToken());
		}
		
		int up = testCase[0];
		int down = testCase[1];
		int total = testCase[2];
		
		int days = (total - down) / (up - down);
		
		if((total - down) % (up - down) != 0) {
			days++;
		}
		
		System.out.println(days);
		
	}

}
