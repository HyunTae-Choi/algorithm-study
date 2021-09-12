package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXquiz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String[] oxRead = new String[repeat];
		for(int i = 0; i < repeat; i++) {
			oxRead[i] = br.readLine();
		}
		for(int i = 0; i < repeat; i++) {
			int score = scoreCalculation(oxRead[i]);
			System.out.println(score);
		}
	}

	private static int scoreCalculation(String string) {
		char[] ox = new char[string.length()];
		int score = 0;
		int scoreIncrease = 0;
		for(int i = 0; i < string.length(); i++) {
			ox[i] = string.charAt(i);
			if(ox[i] == 'O') {
				scoreIncrease++;
				score += scoreIncrease;
			} else {
				scoreIncrease = 0;
			}
		}
		
		return score;
	}

}
