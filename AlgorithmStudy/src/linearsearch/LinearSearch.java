package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HyeonTaeChoi
 * @version 1.0 2021.09.04
 * Search (Ž��) : ����� ������ �߿� ���ϴ� ���� ã�� ��
 * LinearSearch(����Ž��) : ���ʺ��� ���������� ���ʴ�� Ž���ϴ� ��
 * */
public class LinearSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {3, 7, -1, 4, 11, 0, 7, 9}; // �迭
		
		System.out.println("�迭 : " + Arrays.toString(arr));
		System.out.print("Ž���� ���� : ");
		int find = scanner.nextInt();
		
		int result = Search(arr, find); // ����Ž�� �޼ҵ� ȣ��
		
		if(result > 0) {
			System.out.print(result + "��°�� �ֽ��ϴ�.");
		} else {
			System.out.print("�迭�ȿ� �����ϴ�.");
		}
		
		scanner.close();
	}

	// ����Ž�� �޼ҵ�
	public static int Search(int[] arr, int find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == find) {
				i += 1;
				return i;
			}
		}
		return -1;
	}
}