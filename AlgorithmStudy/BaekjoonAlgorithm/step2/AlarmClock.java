package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmClock {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(a == 0) {
			if(b >= 45) {
				System.out.println(a + " " + (b - 45));
			} else {
				a = 23;
				System.out.println(a + " " + (b + 15));
			}
		} else {
			if(b >= 45) {
				System.out.println(a + " " + (b - 45));
			} else {
				a--;
				System.out.println(a + " " + (b + 15));
			}
		}
	}

}
