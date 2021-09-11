package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APT {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[][] count = new int[15][15];
		for(int i = 0; i < 15; i++) {
			count[0][i] = i;
			count[i][1] = 1;
		}

		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				count[i][j] = count[i][j-1] + count[i-1][j];
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		int[] result = new int[repeat];
		for(int i = 0; i < repeat; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			result[i] = count[k][n];
		}
		
		for(int i = 0; i < repeat; i++) {
			System.out.println(result[i]);
		}
		
	}

}
