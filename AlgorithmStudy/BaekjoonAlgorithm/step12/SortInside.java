package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortInside {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String testCase = br.readLine();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < testCase.length(); i++) {
			list.add((int) testCase.charAt(i) - 48);
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		
	}

}
