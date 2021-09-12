package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusBminus5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = 1;
		int b = 1;
		
		while(a != 0 && b != 0) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			int result = a + b;
			if(result != 0) bw.write(result + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
