package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HyeonTaeChoi
 * @version 1.0 2021.09.04
 * Search (탐색) : 저장된 정보들 중에 원하는 값을 찾는 것
 * LinearSearch(선형탐색) : 왼쪽부터 오른쪽으로 차례대로 탐색하는 것
 * */
public class LinearSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {3, 7, -1, 4, 11, 0, 7, 9}; // 배열
		
		System.out.println("배열 : " + Arrays.toString(arr));
		System.out.print("탐색할 숫자 : ");
		int find = scanner.nextInt();
		
		int result = Search(arr, find); // 선형탐색 메소드 호출
		
		if(result > 0) {
			System.out.print(result + "번째에 있습니다.");
		} else {
			System.out.print("배열안에 없습니다.");
		}
		
		scanner.close();
	}

	// 선형탐색 메소드
	public static int Search(int[] arr, int find) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == find) {
				i += 1;
				return i;
			}
		}
		return -1;
	}
}