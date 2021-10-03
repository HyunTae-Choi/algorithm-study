package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nadan {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < N; i++) {
			System.out.println(i);
			K -= i;
		}
		
		System.out.print(K);
	}

}
