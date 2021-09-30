package basic81to90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		double result = w * h * b / 8.0 / 1024 / 1024;
		System.out.println(Math.round(result * 100) / 100.0 + " MB");
		
	}

}
