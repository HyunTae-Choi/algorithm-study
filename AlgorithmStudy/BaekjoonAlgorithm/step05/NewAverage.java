package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NewAverage {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalSub = Integer.parseInt(br.readLine());
		String scoreStr = br.readLine();
		StringTokenizer st = new StringTokenizer(scoreStr, " ");
		double[] scoreArr = new double[totalSub];
		double[] scoreArrNew = new double[totalSub];
		double newSum = 0;
		double newAvg = 0;
		
		for(int i = 0; i < totalSub; i++) {
			scoreArr[i] = Integer.parseInt(st.nextToken());
		}
		
		double maxScore = maxScore(scoreArr);
		
		for(int i = 0; i < totalSub; i++) {
			scoreArrNew[i] = (scoreArr[i] / maxScore) * 100;
			newSum += scoreArrNew[i];
		}
		
		newAvg = newSum / totalSub;
		System.out.println(newAvg);
	}

	private static double maxScore(double[] scoreArr) {
		double maxScore = 0;
		for(int i = 0; i < scoreArr.length; i++) {
			if(maxScore < scoreArr[i]) {
				maxScore = scoreArr[i];
			}
		}
		return maxScore;
	}

}
