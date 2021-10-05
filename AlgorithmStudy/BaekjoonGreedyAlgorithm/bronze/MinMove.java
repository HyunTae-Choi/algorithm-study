package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class MinMove {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		List<Integer> testCase = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < count; i++) {
			testCase.add(Integer.parseInt(st.nextToken()));
		}
		
		int max = Collections.max(testCase);
		testCase.remove(Integer.valueOf(max));
		
		int sum = 0;
		for(int i = 0; i < testCase.size(); i++) {
			sum += testCase.get(i);
		}
		
		System.out.println(sum);
	}

}
