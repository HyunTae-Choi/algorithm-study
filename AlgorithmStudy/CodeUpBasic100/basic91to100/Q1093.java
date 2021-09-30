package basic91to100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int[] result = new int[23];
		
		for(int i = 0; i < repeat; i++) {
			int a = Integer.parseInt(st.nextToken());
			result[a - 1]++;
		}
		
		for(int i = 0; i < result.length; i++) {
			if(i == result.length - 1) {
				sb.append(result[i]);
			} else {
				sb.append(result[i] + " ");
			}
			
		}
		
		System.out.println(sb);
				
	}

}
