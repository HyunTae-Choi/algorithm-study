package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HyeonTaeChoi
 * @version 1.0 2021.09.04
 * Search (탐색) : 저장된 정보들 중에 원하는 값을 찾는 것
 * BinarySearch(이분탐색) : 정렬되어 있는(이분 탐색의 주요 조건) 배열에서 데이터를 찾으려 시도할 때, 탐색 범위를 절반씩 줄여가며 찾아가는 Search 방법이다.
 * */
public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 3, 8, -1, 4, 11, 0, 7, 9 }; // 배열

		System.out.println("배열 : " + Arrays.toString(arr));

		int[] arrSort = SelectionSort(arr);
		System.out.println("오름차순 배열 : " + Arrays.toString(arrSort));
		
		System.out.print("탐색할 숫자 : "); 
		int find = scanner.nextInt();
		 
		int result = Search(arrSort, find); // 선형탐색 메소드 호출
		 
		if(result > 0) { 
			System.out.print(result + "번째에 있습니다."); 
		} else {
			System.out.print("배열안에 없습니다."); 
		}
		  
		scanner.close();

	}

	// 오름차순 선택정렬 메소드
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

	// 이분탐색 메소드
	public static int Search(int[] arr, int find) {
		int min = 0; // 배열 중 시작 번째
		int mid = 0; // 전체 배열 중 가운데
		int max = arr.length-1; // 배열 중 마지막 번째
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
