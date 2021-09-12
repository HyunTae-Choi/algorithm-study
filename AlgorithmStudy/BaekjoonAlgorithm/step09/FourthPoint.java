package step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthPoint {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] fourPoint = new int[4][2]; 
		for(int i = 0; i < 3; i++) {
			String testCase = br.readLine();
			st = new StringTokenizer(testCase, " ");
			for(int j = 0; j < 2; j++) {
				fourPoint[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		if(fourPoint[0][0] == fourPoint[1][0]) {
			fourPoint[3][0] = fourPoint[2][0];
		} else if(fourPoint[0][0] == fourPoint[2][0]) {
			fourPoint[3][0] = fourPoint[1][0];
		} else {
			fourPoint[3][0] = fourPoint[0][0];
		}
		
		if(fourPoint[0][1] == fourPoint[1][1]) {
			fourPoint[3][1] = fourPoint[2][1];
		} else if(fourPoint[0][1] == fourPoint[2][1]) {
			fourPoint[3][1] = fourPoint[1][1];
		} else {
			fourPoint[3][1] = fourPoint[0][1];
		}
		
		System.out.println(fourPoint[3][0] + " " + fourPoint[3][1]);
		
	}
}
