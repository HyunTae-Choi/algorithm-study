package basic61to70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1069 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String testCase = br.readLine();
		
		switch (testCase) {
		case "A":
			System.out.println("best!!!");
			break;
		case "B":
			System.out.println("good!!");
			break;
		case "C":
			System.out.println("run!");
			break;
		case "D":
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
		
	}
	
}
