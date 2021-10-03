package basic91to100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1097 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] go = new int[19][19];
		StringTokenizer st;
		for(int i = 0; i < 19; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < 19; j++) {
				go[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int repeat = Integer.parseInt(br.readLine());
		for(int i = 0; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()) - 1;
			int m = Integer.parseInt(st.nextToken()) - 1;
			for(int j = 0; j < 19; j++) {
				go[n][j] = (go[n][j] == 1) ? 0 : 1;
			}
			for(int k = 0; k < 19; k++) {
				go[k][m] = (go[k][m] == 1) ? 0 : 1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 19; i++) {
			for(int j = 0; j < 19; j++) {
				if(j == 18) {
					sb.append(go[i][j]);
				} else {
					sb.append(go[i][j] + " ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
