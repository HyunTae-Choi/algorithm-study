package step11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Bulk {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
 
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " "); // ���ڿ� �и�
			arr[i][0] = Integer.parseInt(st.nextToken()); // [i][0] : ������ 
			arr[i][1] = Integer.parseInt(st.nextToken()); // [i][1] : Ű 
		}
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			for(int j = 0; j < N; j++) {
				if(i == j) continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
 
			System.out.print(rank + " ");
		}
 
	}
}
