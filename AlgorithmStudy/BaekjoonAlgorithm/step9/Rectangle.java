package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rectangle {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCaseStr = br.readLine();
		StringTokenizer st = new StringTokenizer(testCaseStr, " ");
		int[] testCase = new int[4];
		for(int i = 0; i < 4; i++) {
			testCase[i] = Integer.parseInt(st.nextToken());
		}
		int x = testCase[0];
		int y = testCase[1];
		int w = testCase[2];
		int h = testCase[3];
		
		int a = 0;
		int b = 0;
		
		if(x > w - x) {
			a = w - x;
		} else {
			a = x;
		}
		
		if(y > h - y) {
			b = h - y;
		} else {
			b = y;
		}
		
		System.out.println(a > b ? b : a);
		
	}
}
