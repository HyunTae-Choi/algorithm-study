package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pythagoras {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Integer.parseInt(br.readLine());
		double PI = Math.PI;
		System.out.println(String.format("%.6f", r * r * PI));
		System.out.println(String.format("%.6f", r * r * 2));
	}

}
