package bubblesort;

import java.util.Arrays;

/**
 * @author hyeontae95
 * @version 1.0 2021.09.04
 * Sort (정렬) : 일정한 순서대로 열거하는 알고리즘
 * BubbleSort (버블정렬) : 두 개의 인접한 원소를 비교하여 정렬하는 알고리즘
 * */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3, 8, -1, 4, 11, 0, 7, 9 }; // 배열

		System.out.println("배열 : " + Arrays.toString(arr));

		int[] arrSortAsc = SortAsc(arr);
		System.out.println("오름차순 배열 : " + Arrays.toString(arrSortAsc));
		
		int[] arrSortDesc = SortDesc(arr);
		System.out.println("내림차순 배열 : " + Arrays.toString(arrSortDesc));

	}

	// 오름차순 버블정렬 메소드
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
	
	// 내림차순 버블정렬 메소드
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
