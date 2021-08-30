package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 3, 7, -1, 4, 11, 0, 7, 9 }; // 배열

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
		int left = 0; // 첫번째 숫자
		int mid = 0; // 가운데 숫자
		int right = arr.length - 1; // 마지막 숫자
		
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
