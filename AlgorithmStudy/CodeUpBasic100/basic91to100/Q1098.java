package basic91to100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1098 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		
		int repeat = Integer.parseInt(br.readLine());
		for(int i = 0; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int l = Integer.parseInt(st.nextToken()); // ±æÀÌ
			int d = Integer.parseInt(st.nextToken()); // °¡·Î 0 ¼¼·Î 1
			int x = Integer.parseInt(st.nextToken()) - 1; // xÁÂÇ¥
			int y = Integer.parseInt(st.nextToken()) - 1; // yÁÂÇ¥
			for(int j = 0; j < l; j++) {
				if(d == 0) {
					arr[x][y + j] = 1; 
				} else {
					arr[x + j][y] = 1;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(j == m - 1) {
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
