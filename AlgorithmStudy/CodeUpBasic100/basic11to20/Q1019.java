package basic11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1019 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ".");
		
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		if(month <= 9 && day <= 9) {
			System.out.println(year + ".0" + month + ".0" + day);
		} else if(month > 9 && day <= 9) {
			System.out.println(year + "." + month + ".0" + day);
		} else if(month <= 9 && day > 9) {
			System.out.println(year + ".0" + month + "." + day);
		} else {
			System.out.println(year + "." + month + "." + day);
		}
	}
	
}
