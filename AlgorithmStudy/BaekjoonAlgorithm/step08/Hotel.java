package step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hotel {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String[] testCase = new String[repeat];
		for(int i = 0; i < repeat; i++) {
			testCase[i] = br.readLine();
		}
		
		for(int i = 0; i < repeat; i++) {
			hotelRoom(testCase[i]);
		}
		
	}

	private static void hotelRoom(String testCase) {
		StringTokenizer st = new StringTokenizer(testCase, " ");
		
		int floor = Integer.parseInt(st.nextToken());
		int room = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		// 6 12 612
		
		if(count == floor * room) {
			System.out.println(floor * 100 + room);
		} else {
			if(count % floor == 0) {
				System.out.println(floor * 100 + (count / floor));
			} else {
				System.out.println((count % floor) * 100 + (count / floor) + 1);
			}
		}
		
	}

}
