package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		while(number < 0 || number > 99) {
			number = Integer.parseInt(br.readLine());
		}
		
		int result = number;
		int count = 0;
		
		while(true) {
			count++;
			int a = (number / 10) + (number % 10);
			number = ((number % 10) * 10) + (a % 10);
			if(result == number) {
				break;
			}
		}
		
		System.out.println(count);
		
	}

}
