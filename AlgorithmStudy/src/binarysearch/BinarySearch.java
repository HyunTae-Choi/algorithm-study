package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 3, 7, -1, 4, 11, 0, 7, 9 }; // �迭

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
		int left = 0; // ù��° ����
		int mid = 0; // ��� ����
		int right = arr.length - 1; // ������ ����
		
		while (right >= left) {
            mid = (right + left) / 2;
 
            if (find == arr[mid]) {
                return mid;
            }
 
            if (find < arr[mid]) {
                right = mid - 1;
                return right;
            } else {
                left = mid + 1;
                return left;
            }
        }
		return -1;
	}
}
