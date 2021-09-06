package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SmallNum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String totalNumbersStr = br.readLine();
		StringTokenizer st = new StringTokenizer(totalNumbersStr, " ");
		int totalNumbers = Integer.parseInt(st.nextToken());
		int comparisonNumber = Integer.parseInt(st.nextToken());
		
		String numberStr = br.readLine();
		st = new StringTokenizer(numberStr, " ");
		for(int i = 0; i < totalNumbers; i++) {
			int number = Integer.parseInt(st.nextToken());
			if(number < comparisonNumber) {
				bw.write(number + " ");
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
