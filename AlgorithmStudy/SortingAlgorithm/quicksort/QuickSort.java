package quicksort;

import java.util.Arrays;

/**
 * @author hyeontae95
 * @version 1.0 2021.09.06
 * Sort (����) : ������ ������� �����ϴ� �˰���
 * QuickSort (������) : �ϳ��� ����Ʈ�� �ǹ�(pivot)�� �������� �� ���� ��յ��� ũ��� �����ϰ� ���ҵ� �κ� ����Ʈ�� ������ ����, �� ���� ���ĵ� �κ� ����Ʈ�� ���Ͽ� ��ü�� �����ϴ� �˰���
 * ����
 * 1. �ӵ��� �ſ� ������.
 * 2. �޸� �Һ� ����. 
 * ����
 * 1. Ư�� �����Ͽ� ������ �ް��ϰ� ��������.
 * */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 3, 8, -1, 4, 11, 0, 7, 9 }; // �迭

		System.out.println("�迭 : " + Arrays.toString(arr));
		
		QuickSortAsc(arr);
		
		System.out.println("�迭 : " + Arrays.toString(arr));

	}

	private static void QuickSortAsc(int[] arr) {
		QuickSortAsc(arr, 0, arr.length - 1);
	}

	private static void QuickSortAsc(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if(start < part2 - 1) {
			QuickSortAsc(arr, start, part2 - 1);
		}
		if(end > part2) {
			QuickSortAsc(arr, part2, end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		while(start < end) {
			while(arr[start] < pivot) {
				start++;
			}
			while(arr[end] > pivot) {
				end--;
			}
			if(start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		System.out.println("�迭 : " + Arrays.toString(arr));
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}

}
