package bubblesort;

import java.util.Arrays;

/**
 * @author hyeontae95
 * @version 1.0 2021.09.04
 * Sort (����) : ������ ������� �����ϴ� �˰���
 * BubbleSort (��������) : �� ���� ������ ���Ҹ� ���Ͽ� �����ϴ� �˰���
 * */
public class BubbleSort {

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
		int round = 1;
		while(round < arr.length) {
			for(int i = 0; i < arr.length - round; i++) {
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			round++;
		}
		return arr;
	}
	
	// �������� �������� �޼ҵ�
	public static int[] SortDesc(int[] arr) {
		int round = 1;
		while(round < arr.length) {
			for(int i = 0; i < arr.length - round; i++) {
				if(arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			round++;
		}
		return arr;
	}
}
