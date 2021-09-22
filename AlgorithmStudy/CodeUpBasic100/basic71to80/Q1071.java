package basic71to80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1071 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int listCount = st.countTokens();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < listCount; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int i = 0;
		
		while(list.get(i) != 0) {
			System.out.println(list.get(i));
			i++;
		}
		
	}
	
}
