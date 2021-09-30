package basic81to90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1090 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		double r = Double.parseDouble(st.nextToken());
		double n = Double.parseDouble(st.nextToken());
		
		double result = a * Math.pow(r, (n-1));
		
		System.out.println(Math.round(result));

	}

}
