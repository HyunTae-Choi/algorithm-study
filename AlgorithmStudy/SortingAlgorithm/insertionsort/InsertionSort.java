package insertionsort;

import java.util.Arrays;

/**
 * @author hyeontae95
 * @version 1.0 2021.09.04
 * Sort (정렬) : 일정한 순서대로 열거하는 알고리즘
 * InsertionSort (삽입정렬) : 현재 비교하고자 하는 타겟과 그 이전의 원소들과 비교하며 자리를 교환하는 정렬 알고리즘
 * 장점
 * 1. 추가적인 메모리 소비가 작다.
 * 2. 거의 정렬 된 경우 매우 효율적이다. 
 * 단점
 * 1. 데이터의 상태에 따라서 성능 편차가 매우 크다.
 * */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 8, -1, 4, 11, 0, 7, 9 }; // 배열

		System.out.println("배열 : " + Arrays.toString(arr));

		int[] arrSortAsc = SortAsc(arr);
		System.out.println("오름차순 배열 : " + Arrays.toString(arrSortAsc));
		
		int[] arrSortDesc = SortDesc(arr);
		System.out.println("내림차순 배열 : " + Arrays.toString(arrSortDesc));

	}

	// 오름차순 삽입정렬 메소드
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
	
	// 내림차순 삽입정렬 메소드
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
