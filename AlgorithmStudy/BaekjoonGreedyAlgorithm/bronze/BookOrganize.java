package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BookOrganize {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int boxA = Integer.parseInt(st.nextToken());
		int boxB = Integer.parseInt(st.nextToken());
		
		int[] bookA = new int[boxA];
		int[] bookB = new int[boxB];
		int sumA = 0;
		int sumB = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < boxA; i++) {
			bookA[i] = Integer.parseInt(st.nextToken());
			sumA += bookA[i];
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < boxB; i++) {
			bookB[i] = Integer.parseInt(st.nextToken());
			sumB += bookB[i];
		}
		
		System.out.println(sumA - sumB);

	}

}
