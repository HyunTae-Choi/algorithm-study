package basic61to70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1064 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = st.countTokens();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < count; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int min = Collections.min(list);
		System.out.println(min);
	}
	
}
