package basic91to100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1096 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] go = new int[20][20];
		int repeat = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			go[n][m]++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < 20; i++) {
			for(int j = 1; j < 20; j++) {
				if(j == 19) {
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
