package insertionsort;

import java.util.Arrays;

/**
 * @author hyeontae95
 * @version 1.0 2021.09.04
 * Sort (����) : ������ ������� �����ϴ� �˰���
 * InsertionSort (��������) : ���� ���ϰ��� �ϴ� Ÿ�ٰ� �� ������ ���ҵ�� ���ϸ� �ڸ��� ��ȯ�ϴ� ���� �˰���
 * */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 8, -1, 4, 11, 0, 7, 9 }; // �迭

		System.out.println("�迭 : " + Arrays.toString(arr));

		int[] arrSortAsc = SortAsc(arr);
		System.out.println("�������� �迭 : " + Arrays.toString(arrSortAsc));
		
		int[] arrSortDesc = SortDesc(arr);
		System.out.println("�������� �迭 : " + Arrays.toString(arrSortDesc));

	}

	// �������� �������� �޼ҵ�
	public static int[] SortAsc(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int target = arr[i];
			int j = i - 1;
			while(j >= 0 && target <= arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = target;
		}
		return arr;
	}
	
	// �������� �������� �޼ҵ�
	public static int[] SortDesc(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int target = arr[i];
			int j = i - 1;
			while(j >= 0 && target >= arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = target;
		}
		return arr;
	}
}
