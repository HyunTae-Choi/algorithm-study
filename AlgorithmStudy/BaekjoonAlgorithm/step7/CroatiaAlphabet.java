package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int alphabetCount = 0;
		for(int i = 0; i < str.length(); i++) {
			char alphabet = str.charAt(i);
			if(alphabet == 'c') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {
						i++;
					} else if(str.charAt(i + 1) == '-') {
						i++;
					}
				}
			} else if(alphabet == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					} else if(str.charAt(i + 1) == '-') {
						i++;
					}
				}
			} else if(alphabet == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			} else if(alphabet == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			} else if(alphabet == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {
						i++;
					}
				}
			} else if(alphabet == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {
						i++;
					}
				}
			} 
			alphabetCount++;
		}
		
		System.out.println(alphabetCount);
	}

}
