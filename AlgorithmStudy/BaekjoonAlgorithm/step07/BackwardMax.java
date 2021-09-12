package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackwardMax {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int[] numbers = new int[2];
		
		int max = 0;
		for(int i = 0; i < 2; i++) {
			String numberStr = new StringBuilder().append(st.nextToken()).reverse().toString();
			numbers[i] = Integer.parseInt(numberStr);
			if(max < numbers[i]) {
				max = numbers[i];
			}
			
		}
		
		System.out.println(max);
		
	}

}
