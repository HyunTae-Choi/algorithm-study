package basic61to70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1066 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = st.countTokens();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> result = new ArrayList<String>();
		
		for(int i = 0; i < count; i++) {
			list.add(Integer.parseInt(st.nextToken()));
			if(list.get(i) % 2 == 0) {
				result.add("even");
			} else {
				result.add("odd");
			}
		}
		
		for(String i : result) {
			System.out.println(i);
		}
		
	}
	
}
