package quicksort;

import java.util.Arrays;

/**
 * @author hyeontae95
 * @version 1.0 2021.09.06
 * Sort (정렬) : 일정한 순서대로 열거하는 알고리즘
 * QuickSort (퀵정렬) : 하나의 리스트를 피벗(pivot)을 기준으로 두 개의 비균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음, 두 개의 정렬된 부분 리스트를 합하여 전체를 정렬하는 알고리즘
 * 장점
 * 1. 속도가 매우 빠르다.
 * 2. 메모리 소비가 적다. 
 * 단점
 * 1. 특정 조건하에 성능이 급격하게 떨어진다.
 * */
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 3, 8, -1, 4, 11, 0, 7, 9 }; // 배열

		System.out.println("배열 : " + Arrays.toString(arr));
		
		QuickSortAsc(arr);
		
		System.out.println("배열 : " + Arrays.toString(arr));

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
		System.out.println("배열 : " + Arrays.toString(arr));
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}

}
