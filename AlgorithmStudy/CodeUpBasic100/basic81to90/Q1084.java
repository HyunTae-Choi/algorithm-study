package basic81to90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1084 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int count = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				for(int k = 0; k < c; k++) {
					if(i == 1 && j == 1 && k == 1) {
						sb.append(i + " " + j + " " + k);
					} else {
						sb.append(i + " " + j + " " + k + "\n");
					}
					count++;
				}
			}
		}
		
		System.out.println(sb);
		System.out.println(count);
	}

}
