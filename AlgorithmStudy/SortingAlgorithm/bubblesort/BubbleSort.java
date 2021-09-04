package bubblesort;

import java.util.Arrays;

/**
 * @author hyeontae95
 * @version 1.0 2021.09.04
 * Sort (정렬) : 일정한 순서대로 열거하는 알고리즘
 * BubbleSort (버블정렬) : 두 개의 인접한 원소를 비교하여 정렬하는 알고리즘
 * 장점
 * 1. 구현이 쉽다.
 * 2. 추가적인 메모리 소비가 작다.
 * 단점
 * 1. 다른 정렬 알고리즘에 비해 교환 과정이 많아 시간을 소비한다.
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
