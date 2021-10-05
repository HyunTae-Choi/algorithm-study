package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CupHolder {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int NumOfPeople = Integer.parseInt(br.readLine());
		String testCase = br.readLine();
		int count = 1;
		for(int i = 0; i < testCase.length();) {
			if(testCase.charAt(i) == 'S') {
				count++;
				i += 1;
			} else {
				count++;
				i += 2;
			}
		}
		
		if(NumOfPeople >= count) {
			System.out.println(count);
		} else {
			System.out.println(NumOfPeople);
		}
		
	}

}
