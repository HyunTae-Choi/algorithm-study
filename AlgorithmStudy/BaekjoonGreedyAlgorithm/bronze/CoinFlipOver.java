package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CoinFlipOver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < repeat; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int a = Collections.frequency(list, 0);
		int b = Collections.frequency(list, 1);
		
		System.out.println(a > b ? b : a);
		
	}

}
