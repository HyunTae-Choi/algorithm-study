package basic91to100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1099 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] arr = new int[10][10];
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 10; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int baseX = 1;
		int baseY = 1;
		while(true) {
			if(arr[baseX][baseY] == 0) {
				arr[baseX][baseY] = 9;
				baseY++;
			} else {
				baseX++;
				baseY--;
			}
			if(arr[baseX][baseY] == 2) {
				arr[baseX][baseY] = 9;
				break;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 9) {
					sb.append(arr[i][j]);
				} else {
					sb.append(arr[i][j] + " ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}

}
