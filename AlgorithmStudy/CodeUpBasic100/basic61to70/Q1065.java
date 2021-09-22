package basic61to70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = st.countTokens();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < count; i++) {
			list.add(Integer.parseInt(st.nextToken()));
			if(list.get(i) % 2 == 0) {
				result.add(list.get(i));
			}
		}
		
		for(int i : result) {
			System.out.println(i);
		}
		
	}
	
}
