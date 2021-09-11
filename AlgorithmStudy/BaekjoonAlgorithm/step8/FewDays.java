package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FewDays {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		StringTokenizer st = new StringTokenizer(word, " ");
		int[] testCase = new int[3];
		for(int i = 0; i < 3; i++) {
			testCase[i] = Integer.parseInt(st.nextToken());
		}
		
		int fixedAmount = testCase[0]; // ���� �ݾ�(��꼼, �����, �޿�) A
		int prodCost = testCase[1]; // ���� ��� B
		int salePrice = testCase[2]; // �Ǹ� �ݾ� C
		
		if (salePrice <= prodCost) {
			System.out.println(-1);
		} 
		else {
			System.out.println((fixedAmount/(salePrice-prodCost))+1);
		}
		
	}

}
