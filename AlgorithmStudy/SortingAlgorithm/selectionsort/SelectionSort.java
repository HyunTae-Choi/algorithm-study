package selectionsort;

import java.util.Arrays;

/**
 * @author hyeontae95
 * @version 1.0 2021.09.04
 * Sort (정렬) : 일정한 순서대로 열거하는 알고리즘
 * SelectionSort (선택정렬) : 현재 위치에 들어갈 데이터를 찾아 선택하는 알고리즘
 * */
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 8, -1, 4, 11, 0, 7, 9 }; // 배열

		System.out.println("배열 : " + Arrays.toString(arr));

		int[] arrSortAsc = SortAsc(arr);
		System.out.println("오름차순 배열 : " + Arrays.toString(arrSortAsc));
		
		int[] arrSortDesc = SortDesc(arr);
		System.out.println("내림차순 배열 : " + Arrays.toString(arrSortDesc));

	}

	// 오름차순 선택정렬 메소드
	public static int[] SortAsc(int[] arr) {
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
	
	// 내림차순 선택정렬 메소드
	public static int[] SortDesc(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
