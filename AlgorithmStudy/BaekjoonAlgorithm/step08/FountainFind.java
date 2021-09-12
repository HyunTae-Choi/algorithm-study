package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FountainFind {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		int line = 0;
		int count = 0;
		
		int top = 0;
		int bottom = 0;
		
		while(count < testCase) {
			line++;
			count = line * (line + 1) / 2; // 등차수열 (항의 총 개수) testCase가 몇번 쨰 항에 있는 지 확인
			
		}
		
		if(line % 2 == 0) {
			top = line - (count - testCase);
			bottom = 1 + (count - testCase);
		} else {
			top = 1 + (count - testCase);
			bottom = line - (count - testCase);
		}
		
		System.out.println(top + "/" + bottom);
		
	}

}
