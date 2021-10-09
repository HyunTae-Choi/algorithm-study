package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(br.readLine());
		int move = 0;
		int left = 0;
		int right = 0 + (m - 1);
		
		if(n > m) {
			for(int i = 0; i < count; i++) {
				int tmp = Integer.parseInt(br.readLine()) - 1;
				if(tmp > right) {
					move += tmp - right;
					right = tmp;
					left = tmp - (m - 1);
				}
				else if(tmp < left) {
					move += left - tmp;
					left = tmp;
					right = tmp + (m - 1);
				}
			}
			System.out.println(move);
		}
		
	}

}
