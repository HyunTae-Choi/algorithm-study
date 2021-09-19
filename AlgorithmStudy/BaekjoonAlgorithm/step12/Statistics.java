package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Statistics {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(br.readLine());
		int[] testCase = new int[N];
		
		for(int i = 0; i < N; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		
		int a = mean(testCase); // »ê¼úÆò±Õ
		int b = median(testCase); // Áß¾Ó°ª
		int c = mode(testCase); // ÃÖºó°ª
		int d = range(testCase); // ¹üÀ§
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

	private static int mean(int[] testCase) {
		int sum = 0;
		for(int i = 0; i < testCase.length; i++) {
			sum += testCase[i];
		}
		
		double result = sum / (testCase.length * 1.0);
		
		return (int) Math.round(result);
	}

	private static int median(int[] testCase) {
		for (int i = 0; i < testCase.length; i++) {
			for (int j = i + 1; j < testCase.length; j++) {
				if (testCase[i] > testCase[j]) {
					int temp = testCase[i];
					testCase[i] = testCase[j];
					testCase[j] = temp;
				}
			}
		}
		int mid = (testCase.length - 1) / 2;
		
		return testCase[mid];
	}

	private static int mode(int[] testCase) {
		int[] x = new int[8001];
		int mode_max = 0;
		int mode = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < testCase.length; i++) {
			x[testCase[i] + 4000]++;
		}
		
		for(int i = 0; i < x.length; i++) {
			if(mode_max < x[i]) {
				mode_max = x[i];
			}
		}
		
		for(int i = 0; i < x.length; i++) {
			if(mode_max == x[i]) {
				list.add(i);
			}
		}
		
		if(list.size() > 1) {
			mode = list.get(1) - 4000;
			return mode;
		} else {
			mode = list.get(0) - 4000;
			return mode;
		}
	}

	private static int range(int[] testCase) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < testCase.length; i++) {
			if(max < testCase[i]) {
				max = testCase[i];
			}
			if(min > testCase[i]) {
				min = testCase[i];
			}
		}
		
		int result = max - min;
		
		return result;
	}

}
