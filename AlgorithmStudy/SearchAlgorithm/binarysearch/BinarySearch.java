package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HyeonTaeChoi
 * @version 1.0 2021.09.04
 * Search (Ž��) : ����� ������ �߿� ���ϴ� ���� ã�� ��
 * BinarySearch(�̺�Ž��) : ���ĵǾ� �ִ�(�̺� Ž���� �ֿ� ����) �迭���� �����͸� ã���� �õ��� ��, Ž�� ������ ���ݾ� �ٿ����� ã�ư��� Search ����̴�.
 * */
public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 3, 8, -1, 4, 11, 0, 7, 9 }; // �迭

		System.out.println("�迭 : " + Arrays.toString(arr));

		int[] arrSort = SelectionSort(arr);
		System.out.println("�������� �迭 : " + Arrays.toString(arrSort));
		
		System.out.print("Ž���� ���� : "); 
		int find = scanner.nextInt();
		 
		int result = Search(arrSort, find); // ����Ž�� �޼ҵ� ȣ��
		 
		if(result > 0) { 
			System.out.print(result + "��°�� �ֽ��ϴ�."); 
		} else {
			System.out.print("�迭�ȿ� �����ϴ�."); 
		}
		  
		scanner.close();

	}

	// �������� �������� �޼ҵ�
	public static int[] SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	// �̺�Ž�� �޼ҵ�
	public static int Search(int[] arr, int find) {
		int min = 0; // �迭 �� ���� ��°
		int mid = 0; // ��ü �迭 �� ���
		int max = arr.length-1; // �迭 �� ������ ��°
		while(min < max) {
			if((min + max) % 2 == 1) {
				mid = ((min + max) / 2) + 1;
			} else {
				mid = (min + max) / 2;
			}
			
			if(find == arr[mid]) {
				return mid + 1;
			} else if(find > arr[mid]) {
				min = mid + 1;
				if(min == max) {
					if(find == arr[max]) {
						return max + 1;
					}
				}
			} else {
				max = mid - 1;
				if(max == min) {
					if(find == arr[min]) {
						return min + 1;
					}
				}
			}
		}
		
		return -1;
	}
}
