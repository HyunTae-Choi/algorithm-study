package basic71to80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1072 {
	public static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int cnt = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		answer(cnt);
		
	}
	private static void answer(int cnt) throws IOException {
		if(cnt > 0) {
			answer(cnt - 1);
			System.out.println(st.nextToken());
		}
		
	}
	
}
