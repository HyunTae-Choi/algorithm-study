package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AverageUpRatio {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String[] testCase = new String[repeat];
		
		for(int i = 0; i < repeat; i++) {
			testCase[i] = br.readLine();
		}
		
		for(int i = 0; i < repeat; i++) {
			double ratio = avgUpRatio(testCase[i]);
			System.out.println(String.format("%.3f", ratio) + "%");
		}
		
	}

	private static double avgUpRatio(String string) {
		StringTokenizer st = new StringTokenizer(string, " ");
		int totalStudent = Integer.parseInt(st.nextToken());
		int[] score = new int[totalStudent];
		int totalScore = 0;
		double avg = 0;
		double ratio = 0;
		for(int i = 0; i < totalStudent; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			totalScore += score[i];
		}
		avg = totalScore / (totalStudent * 1.0);
		
		ratio = avgUpRatio(score, avg);
		
		return ratio;
	}

	private static double avgUpRatio(int[] score, double avg) {
		double ratio = 0;
		int count = 0;
		for(int i = 0; i < score.length; i++) {
			if(score[i] > avg) {
				count++;
			}
		}
		ratio = count / (score.length * 1.0) * 100;
		
		return ratio;
	}

}
