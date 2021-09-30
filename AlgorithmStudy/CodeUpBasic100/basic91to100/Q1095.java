package basic91to100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q1095 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < repeat; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(Collections.min(list));
	}

}
