package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpaceMover {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String[] testCase = new String[repeat];
		int[] result = new int[repeat];
		StringTokenizer st;
		for(int i = 0; i < repeat; i++) {
			testCase[i] = br.readLine();
		}
		
		for(int i = 0; i < repeat; i++) {
			st = new StringTokenizer(testCase[i], " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			result[i] = move(x, y); 
		}
		
		for(int i = 0; i < repeat; i++) {
			System.out.println(result[i]);
		}
		
	}

	private static int move(int x, int y) {
		int result = 0;
		int distance = y - x;
		int max = (int)Math.sqrt(distance);
		
		if(max == Math.sqrt(distance)) {
			result = max * 2 - 1;
		} else if(distance <= max * max + max) {
			result = max * 2;
		} else {
			result = max * 2 + 1;
		}
		
		return result;
	}

}
