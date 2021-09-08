package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticSequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 1; i <= length; i++) {
			boolean result = check(i);
			if(result) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

	private static boolean check(int number) {
		if(number < 100) {
			return true;
		} else {
			ArrayList<Integer> arrNum = new ArrayList<Integer>();
			while(number > 0) {
				arrNum.add(number % 10);
				number = number / 10;
			}
			Collections.reverse(arrNum); // ArrayList ¿ª¼ø
			
			int difference = arrNum.get(0) - arrNum.get(1);
			difference = Math.abs(difference);
			for(int i = 2; i < arrNum.size(); i++) {
				if(arrNum.get(0) > arrNum.get(1)) {
					if(arrNum.get(i) == (arrNum.get(0) - (i * difference))) {
						continue;
					} else {
						return false;
					}
				} else {
					if(arrNum.get(i) == (arrNum.get(0) + (i * difference))) {
						continue;
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}
	
}
