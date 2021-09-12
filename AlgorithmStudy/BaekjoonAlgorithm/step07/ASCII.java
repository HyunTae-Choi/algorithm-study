package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String codeStr = br.readLine();
		char code = codeStr.charAt(0);
		System.out.println(code + 'B');
	}

}
