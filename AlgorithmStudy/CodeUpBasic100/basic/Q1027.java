package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1027 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ".");

		String year = st.nextToken();
		String month = st.nextToken();
		String day = st.nextToken();
		
		System.out.println(day + "-" + month + "-" + year);
	}
	
}
