package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class WordSort {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int repeat = Integer.parseInt(br.readLine());
		
		HashSet<String> hs = new HashSet<String>();
		
		for(int i = 0; i < repeat; i++) {
			hs.add(br.readLine());
		}
		
		String[] testCase = new String[hs.size()];
		Iterator<String> iter = hs.iterator();
		int count = 0;
		
		while(iter.hasNext()) {
			testCase[count] = iter.next();
			count++;
		}
		
		
		Arrays.sort(testCase, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}
		});
		
		for(String result : testCase) {
			System.out.println(result);
		}
	}
}
